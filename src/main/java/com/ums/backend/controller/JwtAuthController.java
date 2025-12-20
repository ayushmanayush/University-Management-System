package com.ums.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import com.ums.backend.dto.JwtLoginRequestDto;
import com.ums.backend.dto.JwtLoginResponseDto;
import com.ums.backend.Security.CustomUserDetail;
import com.ums.backend.Security.JwtService;

@RestController
@RequestMapping("/auth")
public class JwtAuthController {

    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity<JwtLoginResponseDto> login(@RequestBody JwtLoginRequestDto dto) {

        Authentication authentication = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        dto.getUsername(),
                        dto.getPassword()
                )
        );

        CustomUserDetail userDetails = (CustomUserDetail) authentication.getPrincipal();
        String token = jwtService.generateToken(userDetails.getUsername(),
                userDetails.getAuthorities().iterator().next().getAuthority());

        JwtLoginResponseDto response = new JwtLoginResponseDto();
        response.setToken(token);
        response.setRole(userDetails.getAuthorities().iterator().next().getAuthority());

        return ResponseEntity.ok(response);
    }
}
