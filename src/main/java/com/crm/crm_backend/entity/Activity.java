package com.crm.crm_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private String message;

    private LocalDateTime createdAt;


    public Activity() {
    }


    public Activity(String type, String message, LocalDateTime createdAt) {
        this.type = type;
        this.message = message;
        this.createdAt = createdAt;
    }


    public Long getId() {
        return id;
    }


    public String getType() {
        return type;
    }


    public String getMessage() {
        return message;
    }


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    public void setType(String type) {
        this.type = type;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}