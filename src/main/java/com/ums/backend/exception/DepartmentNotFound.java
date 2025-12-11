package com.ums.backend.exception;

public class DepartmentNotFound extends RuntimeException {
    public DepartmentNotFound(String message){
        super(message);
    }
    
}
