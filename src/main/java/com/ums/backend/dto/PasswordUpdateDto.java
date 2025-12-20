package com.ums.backend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class PasswordUpdateDto {
    @NotBlank(message = "Password should not be blank")
    private String password;
}
