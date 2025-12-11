package com.ums.backend.mapper;

import org.springframework.stereotype.Component;

import com.ums.backend.dto.DepartmentRequestDto;
import com.ums.backend.dto.DepartmentResponseDto;
import com.ums.backend.entity.Department;
@Component
public class DepartmentUpdateMapper {
    public Department updateExisting(DepartmentRequestDto department,Department departmentToUpdate){
        departmentToUpdate.setDepartmentName(department.getDepartmentName());
        departmentToUpdate.setDepartmentId(department.getDepartmentId());
        return departmentToUpdate;
    }   
    public DepartmentResponseDto sendUpdate(Department department) {
        DepartmentResponseDto newDepartment = new DepartmentResponseDto();
        newDepartment.setDepartmentId(department.getDepartmentId());
        newDepartment.setDepartmentName(department.getDepartmentName());
        newDepartment.setCreatedAt(department.getCreatedAt());
        return newDepartment;
    }
}
