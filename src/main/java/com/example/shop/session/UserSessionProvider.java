package com.example.shop.session;

import com.example.shop.model.User;
import com.example.shop.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.transaction.Transactional;

@Component
@SessionScope
public class UserSessionProvider {

    @Autowired
    private UserDetailsService userDetailsService;

    private User user;

    public User getLoggedUser() {
        return user;
    }

    @Transactional
    public void saveLoggedUser(String username) {
        user = (User) userDetailsService.loadUserByUsername(username);
    }

}
