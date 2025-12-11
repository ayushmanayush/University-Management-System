package com.ums.backend.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name ="departments")
@Data
public class Department {
    @Id
    @Column(nullable = false,unique = true,updatable = false)
    private String departmentId;
    @Column(nullable = false)
    private String departmentName;
    @Column(nullable = false)
    private LocalDate createdAt;
}
