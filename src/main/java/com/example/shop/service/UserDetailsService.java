package com.example.shop.service;

<<<<<<< HEAD
import com.example.shop.model.User;
=======
>>>>>>> 396e1405ce15cfefc850c2eda3854def14fa20af
import com.example.shop.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.util.List;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

private final UserRepository userRepository;
=======
@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final UserRepository userRepository;
>>>>>>> 396e1405ce15cfefc850c2eda3854def14fa20af

    public UserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

<<<<<<< HEAD

=======
>>>>>>> 396e1405ce15cfefc850c2eda3854def14fa20af
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userRepository.findById(s).orElseThrow(() -> new UsernameNotFoundException("Could not find user with username: " + s));
    }
<<<<<<< HEAD

    public List<User> findAll() {
        return userRepository.findAll();
    }
=======
>>>>>>> 396e1405ce15cfefc850c2eda3854def14fa20af
}
