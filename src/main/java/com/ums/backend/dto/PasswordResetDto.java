package com.ums.backend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PasswordResetDto {
    @NotBlank
    String RegId;
    @NotBlank
    String OldPassword;
    @NotBlank
    String NewPassword;
}
