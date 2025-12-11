package com.ums.backend.dto;

import java.time.LocalDate;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DepartmentResponseDto {
    @Id
    @NotBlank
    private String departmentId;
    @NotBlank
    private String departmentName;
    @NotBlank
    private LocalDate createdAt;
}
