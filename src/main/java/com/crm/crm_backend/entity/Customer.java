package com.crm.crm_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String company;

    private String notes;


    public Customer() {
    }


    public Customer(String name, String email, String phone, String company, String notes) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.company = company;
        this.notes = notes;
    }


    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }


    public String getPhone() {
        return phone;
    }


    public String getCompany() {
        return company;
    }


    public String getNotes() {
        return notes;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public void setCompany(String company) {
        this.company = company;
    }


    public void setNotes(String notes) {
        this.notes = notes;
    }
}