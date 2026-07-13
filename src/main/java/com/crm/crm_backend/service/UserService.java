package com.crm.crm_backend.service;

import org.springframework.stereotype.Service;

import com.crm.crm_backend.entity.User;
import com.crm.crm_backend.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User saveUser(User user) {
        return userRepository.save(user);
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}