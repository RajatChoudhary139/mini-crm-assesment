package com.crm.crm_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.crm_backend.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

    List<Lead> findByFullNameContainingIgnoreCase(String fullName);

    List<Lead> findByEmailContainingIgnoreCase(String email);

    List<Lead> findByCompanyContainingIgnoreCase(String company);
    
    List<Lead> findByStatusIgnoreCase(String status);
}