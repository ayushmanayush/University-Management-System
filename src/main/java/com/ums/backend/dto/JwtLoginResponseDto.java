package com.ums.backend.dto;

import lombok.Data;

@Data
public class JwtLoginResponseDto {
    private String token;
    private String role;
}
