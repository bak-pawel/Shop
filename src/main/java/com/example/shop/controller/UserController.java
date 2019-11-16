package com.example.shop.controller;

import com.example.shop.model.Role;
import com.example.shop.model.User;
import com.example.shop.repository.RoleRepository;
import com.example.shop.service.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    private final UserDetailsService userDetailsService;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    public UserController(UserDetailsService userDetailsService, PasswordEncoder passwordEncoder, RoleRepository roleRepository) {
        this.userDetailsService = userDetailsService;

        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;
    }



    @GetMapping("/login")
    public ModelAndView getLoginPage() {
        return new ModelAndView("login");
    }

    @GetMapping("/admin")
    public ModelAndView getAdminPage() {
        return new ModelAndView("admin");
    }
    @GetMapping("/accessDenied")
    public ModelAndView getAccessDeniedPage() {
        return new ModelAndView("accessDenied");
    }

    @GetMapping("/register")
    public ModelAndView createUserView() {
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/register")
    public String addUser(@ModelAttribute User user) {
        Role role = roleRepository.getOne(1L);
        user.setRole(role);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userDetailsService.saveUser(user);
        return "redirect:/";
    }

}
