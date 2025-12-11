package com.ums.backend.dto;


import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class DepartmentRequestDto {
    @Id
    @NotBlank
    private String departmentId;
    @NotBlank
    private String departmentName;
}
