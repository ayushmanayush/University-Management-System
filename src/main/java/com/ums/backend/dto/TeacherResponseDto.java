package com.ums.backend.dto;
import java.time.LocalDate;

import lombok.Data;
@Data
public class TeacherResponseDto {
        private String teacherId;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private String department;
        private LocalDate dateJoined;
}
