package com.ums.backend.service;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.ums.backend.entity.*;
import com.ums.backend.repository.*;
@Service
public class StudentService{
  @Autowired
  private Studentrepository studentrepo;
  public Student createStudent(Student student){
    String reg_year = String.valueOf(LocalDate.now().getYear());
    int year = (Integer.parseInt(reg_year.substring(2)))*1000;
    int count_student = (int)studentrepo.count();
    year += count_student + 1;
    String reg = "1" + String.valueOf(year);
    student.setRegid(reg);
    student.setYearAdmission(reg_year);
    return studentrepo.save(student);
  }
  public Student findStudent(String id){
    return studentrepo.getReferenceById(id);
  }
}
