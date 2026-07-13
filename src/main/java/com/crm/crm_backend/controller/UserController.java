package com.crm.crm_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.crm.crm_backend.entity.User;
import com.crm.crm_backend.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }


    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
