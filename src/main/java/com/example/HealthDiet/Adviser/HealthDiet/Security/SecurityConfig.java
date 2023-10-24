//package com.example.HealthDiet.Adviser.HealthDiet.Security;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/admin/addCategory").permitAll() // Allow access to /admin/addCategory without authentication
//                .anyRequest().authenticated() // Require authentication for other requests
//                .and()
//                .formLogin()
//                .loginPage("/login") // Specify your custom login page if needed
//                .permitAll()
//                .and()
//                .logout()
//                .logoutUrl("/logout") // URL for logout
//                .permitAll();
//    }
//}
