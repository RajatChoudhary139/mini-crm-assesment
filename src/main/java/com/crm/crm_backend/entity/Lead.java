package com.crm.crm_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="leads")
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String email;

    private String phoneNumber;

    private String company;

    private String status;

    private String notes;


    public Lead() {
    }


    public Lead(String fullName, String email, String phoneNumber, String company, String status, String notes) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.company = company;
        this.status = status;
        this.notes = notes;
    }


    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCompany() {
        return company;
    }

    public String getStatus() {
        return status;
    }

    public String getNotes() {
        return notes;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}