package com.ums.backend.repository;
import com.ums.backend.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
    public interface Departmentrepository extends JpaRepository<Department,String> {
         
    }
