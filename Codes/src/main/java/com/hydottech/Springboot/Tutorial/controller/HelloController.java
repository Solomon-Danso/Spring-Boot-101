package com.hydottech.Springboot.Tutorial.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld(){
        return "Hello Money Bingo Solomon Danso Is Money Bingo";
    }



}
