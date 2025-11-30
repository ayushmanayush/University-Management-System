package com.ums.backend.service;

import org.springframework.stereotype.Service;

import com.ums.backend.entity.*;
import com.ums.backend.repository.*;
@Service
public class StudentService(Studentrepository studentrepo) {
  this.studentrepo = studentrepo;  
}
