package com.ums.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.ums.backend.service.*;
import com.ums.backend.dto.*;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ums.backend.dto.TeacherRequestDto;


@RestController
@Data
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherservice;
    @PostMapping
    public ResponseEntity<TeacherResponseDto> createTeacher(@RequestBody TeacherRequestDto teacher){
        return ResponseEntity.status(HttpStatus.CREATED).body(teacherservice.crateTeacherDto(teacher));
    }
    
    
}
