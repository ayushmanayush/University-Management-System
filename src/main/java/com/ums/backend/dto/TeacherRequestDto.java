package com.ums.backend.dto;

import lombok.Data;

@Data
public class TeacherRequestDto {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String department;
    private String address;
}
