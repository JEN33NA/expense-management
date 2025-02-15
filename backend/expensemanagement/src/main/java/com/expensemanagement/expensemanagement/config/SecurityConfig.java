package com.expensemanagement.expensemanagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .requestMatchers("/**").permitAll()  // Allow all requests without authentication
            .anyRequest().authenticated()
            .and()
            .csrf().disable();  // Disable CSRF protection (useful for development but not recommended for production)

        return http.build();
    }

    // Optional: Define a PasswordEncoder bean if you need it for hashing passwords
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // You can use any password encoder here
    }
}
