package com.ums.backend.dto;

import lombok.Data;

@Data
public class ForgotPasswordRequestDto {
    private String username;
    private String email;
    private String verificationValue;
    private String role;
    private String newPassword;
}
