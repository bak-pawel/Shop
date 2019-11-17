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
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/h2-console/**").permitAll()
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
                .headers().frameOptions().disable()
                .and()
                .logout()
                .logoutSuccessUrl("/login?logout");
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    //    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("johnson").password(passwordEncoder().encode("123")).roles("USER", "ADMIN")
//                .and()
//                .withUser("user").password(passwordEncoder().encode("user")).roles("USER");
//    }
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}