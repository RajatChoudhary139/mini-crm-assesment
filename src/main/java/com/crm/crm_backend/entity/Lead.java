package com.crm.crm_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="leads")
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Full Name is required")
    @Size(min = 3, max = 50, message = "Full Name must be between 3 and 50 characters")
    private String fullName;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Phone Number is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone Number must be exactly 10 digits")
    private String phoneNumber;

    @NotBlank(message = "Company is required")
    @Size(min = 2, max = 100, message = "Company must be between 2 and 100 characters")
    private String company;

    @NotBlank(message = "Status is required")
    private String status;

    @Size(max = 500, message = "Notes cannot exceed 500 characters")
    private String notes;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


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
    
    public User getUser() {
        return user;
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
    
    public void setUser(User user) {
        this.user = user;
    
    }
}