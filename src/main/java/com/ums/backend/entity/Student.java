package com.ums.backend.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "students")
public class Student {
    @Id
    private String reg_id;

    private String firstname;
    private String lastname;
    private LocalDate dob;
    private String email;
    private String phonenumber;
    private String address;
    private String department;
    private String yearadmission;
}
