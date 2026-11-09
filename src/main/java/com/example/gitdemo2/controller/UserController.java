package com.example.gitdemo2.controller;


import com.example.gitdemo2.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getUserById")
    public User getUserById(){
        return User.builder().name("qqq").age(12).build();
    }
}
