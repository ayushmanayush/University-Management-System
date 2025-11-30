package com.ums.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ums.backend.entity.Student;

@Repository
public interface Studentrepository extends JpaRepository<Student,String>{
    
}