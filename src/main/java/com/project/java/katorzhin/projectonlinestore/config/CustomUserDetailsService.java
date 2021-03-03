package com.project.java.katorzhin.projectonlinestore.config;

import com.project.java.katorzhin.projectonlinestore.entity.UserEntity;
import com.project.java.katorzhin.projectonlinestore.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public CustomUserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserEntity userEntity = userService.findByEmail(email);
        return CustomUserDetails.fromUserEntityToCustomUserDetails(userEntity);
    }
}
