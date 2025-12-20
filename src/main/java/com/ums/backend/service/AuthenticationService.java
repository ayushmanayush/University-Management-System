package com.ums.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.ums.backend.dto.LoginRequestDto;
import com.ums.backend.dto.LoginResponseDto;

@Service
public class AuthenticationService {

    @Autowired
    private AuthenticationManager authenticationManager;

    public LoginResponseDto login(LoginRequestDto request) {

        Authentication auth = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );

        LoginResponseDto response = new LoginResponseDto();
        response.setMessage("Login Successful for " + auth.getName());

        return response;
    }
}