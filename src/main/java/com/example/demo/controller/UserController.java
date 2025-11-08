package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @GetMapping("/getUser")
    public String getUser() {
        return "User data";
    }

    @PostMapping("/saveUser")
    public String saveUser() {
        return "Save user";
    }

    @PutMapping("/updateUser")
    public String updateUser() {
        return "Update user";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser() {
        return "Delete user";
    }
}
