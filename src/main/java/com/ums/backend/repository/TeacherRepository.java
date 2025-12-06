package com.ums.backend.repository;
import com.ums.backend.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,String> {
}
