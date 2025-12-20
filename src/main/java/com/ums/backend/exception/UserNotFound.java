package com.ums.backend.exception;

public class UserNotFound extends RuntimeException{
    public UserNotFound(String mesage){
        super(mesage);
    }
    
}
