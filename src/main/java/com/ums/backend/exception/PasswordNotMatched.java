package com.ums.backend.exception;

public class PasswordNotMatched extends RuntimeException{
    public PasswordNotMatched(String message){
    super(message);
    }
}
