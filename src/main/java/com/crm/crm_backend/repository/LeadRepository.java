package com.crm.crm_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crm.crm_backend.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}