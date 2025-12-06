package com.ums.backend.service;
import com.ums.backend.entity.*;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ums.backend.dto.TeacherRequestDto;
import com.ums.backend.dto.TeacherResponseDto;
import com.ums.backend.mapper.TeacherCreationMapper;
import com.ums.backend.repository.TeacherRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TeacherService {
    @Autowired
    TeacherCreationMapper teachermapper;
    @Autowired
    TeacherRepository teacherrepo;
    public synchronized String getteacherId(){
        int value = 10000;
        int count = (int)teacherrepo.count();
        value += count + 1;
        String teach_id = String.valueOf(value);
        return teach_id; 
    }

    public TeacherResponseDto crateTeacherDto(TeacherRequestDto teacher){
        Teacher newTeacher = teachermapper.toEntityDto(teacher);
        newTeacher.setTeacherId(getteacherId());
        newTeacher.setDateJoined(LocalDate.now());
        Teacher savedTeacher = teacherrepo.save(newTeacher);
        return teachermapper.toResponseDto(savedTeacher);
    }
}
