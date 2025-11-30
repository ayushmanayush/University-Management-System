package com.ums.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthcontroller {
    @GetMapping("/happy")
    public String gethealth(){
        return "working hai jee";
    }
}
