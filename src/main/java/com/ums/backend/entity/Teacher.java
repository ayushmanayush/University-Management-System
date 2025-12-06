package com.ums.backend.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "teacher")
@Data
public class Teacher {
    @Id
    private String teacherId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String department;
    private LocalDate dateJoined;
    private String address;

}
