package com.ums.backend.mapper;

import org.springframework.stereotype.Component;

import com.ums.backend.dto.DepartmentRequestDto;
import com.ums.backend.dto.DepartmentResponseDto;
import com.ums.backend.entity.*;
@Component
public class DepartmentCreationMapper {
    public Department toDepartmentEntity(DepartmentRequestDto department){
        Department newDepartment = new Department();
        newDepartment.setDepartmentId(department.getDepartmentId());
        newDepartment.setDepartmentName(department.getDepartmentName());
        return newDepartment;
    }
    public DepartmentResponseDto toUser(Department department){
        DepartmentResponseDto departmentTosend = new DepartmentResponseDto();
        departmentTosend.setDepartmentId(department.getDepartmentId());
        departmentTosend.setDepartmentName(department.getDepartmentName());
        departmentTosend.setCreatedAt(department.getCreatedAt());
        return departmentTosend;
    }
}
