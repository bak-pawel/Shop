package com.example.shop.config;

import com.example.shop.service.UserDetailsService;
import com.example.shop.session.AutenticationSuccesHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final UserDetailsService userDetailsService;
    private final AutenticationSuccesHandler succesHandler;
    public SecurityConfig(UserDetailsService userDetailsService, AutenticationSuccesHandler succesHandler) {
        this.userDetailsService = userDetailsService;
        this.succesHandler = succesHandler;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/register").permitAll()
                .antMatchers("/").permitAll()
                .antMatchers("/contact").permitAll()
                .antMatchers("/store").permitAll()
                .antMatchers("/braker").permitAll()
                .antMatchers("/lowVoltage").permitAll()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/h2-console/**").permitAll()
                .antMatchers("/img/**").permitAll()
                .antMatchers("/**").authenticated()
                .and()
                .formLogin().loginPage("/login")
                .usernameParameter("user")
                .passwordParameter("password")
                .successHandler(succesHandler)
                .and()
                .exceptionHandling()
                .accessDeniedPage("/accessDenied").and()
                .headers().frameOptions().disable()
                .and()
                .logout()
                .logoutSuccessUrl("/");
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}