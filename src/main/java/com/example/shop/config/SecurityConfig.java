package com.example.shop.config;

import com.example.shop.service.UserDetailsService;
<<<<<<< HEAD
=======
import com.example.shop.session.AutenticationSuccesHandler;
import com.example.shop.session.UserSessionProvider;
>>>>>>> 396e1405ce15cfefc850c2eda3854def14fa20af
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
<<<<<<< HEAD
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsService userDetailsService;

    public SecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }


=======

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 private final UserDetailsService userDetailsService;
private final AutenticationSuccesHandler succesHandler;
    public SecurityConfig(UserDetailsService userDetailsService, AutenticationSuccesHandler succesHandler) {
        this.userDetailsService = userDetailsService;
        this.succesHandler = succesHandler;
    }

>>>>>>> 396e1405ce15cfefc850c2eda3854def14fa20af
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/login").permitAll()
<<<<<<< HEAD
                .antMatchers("/h2-console/**").permitAll()
                .antMatchers("/register").permitAll()
                .antMatchers("/admin").hasAuthority("ADMIN")
                .antMatchers("/super").hasAuthority("SUPER_USER")
                .antMatchers("/**").authenticated()
                .and()
                .formLogin().loginPage("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .successHandler(successHandler())
=======
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/**").authenticated()
                .and()
                .formLogin().loginPage("/login")
                .usernameParameter("user")
                .passwordParameter("password")
                .successHandler(succesHandler)
>>>>>>> 396e1405ce15cfefc850c2eda3854def14fa20af
                .and()
                .exceptionHandling()
                .accessDeniedPage("/accessDenied")
                .and()
<<<<<<< HEAD
                .headers().frameOptions().disable()
                .and()
                .logout()
                .logoutSuccessUrl("/login?logout");
    }

=======
                .logout()
                .logoutSuccessUrl("/login?logout");
    }
>>>>>>> 396e1405ce15cfefc850c2eda3854def14fa20af
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

<<<<<<< HEAD
    @Bean
    AuthenticationSuccessHandler successHandler() {
        return new SavedRequestAwareAuthenticationSuccessHandler();
    }

=======
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("johnson").password(passwordEncoder().encode("123")).roles("USER", "ADMIN")
//                .and()
//                .withUser("user").password(passwordEncoder().encode("user")).roles("USER");
//    }
>>>>>>> 396e1405ce15cfefc850c2eda3854def14fa20af
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
<<<<<<< HEAD


=======
>>>>>>> 396e1405ce15cfefc850c2eda3854def14fa20af
}
