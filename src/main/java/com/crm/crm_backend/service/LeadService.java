package com.crm.crm_backend.service;

import org.springframework.stereotype.Service;

import com.crm.crm_backend.entity.Lead;
import com.crm.crm_backend.repository.LeadRepository;

import java.util.List;

@Service
public class LeadService {

    private final LeadRepository leadRepository;


    public LeadService(LeadRepository leadRepository) {
        this.leadRepository = leadRepository;
    }


    public Lead createLead(Lead lead) {
        return leadRepository.save(lead);
    }


    public List<Lead> getAllLeads() {
        return leadRepository.findAll();
    }


    public Lead getLeadById(Long id) {
        return leadRepository.findById(id).orElse(null);
    }


    public Lead updateLead(Long id, Lead lead) {

        Lead existingLead = leadRepository.findById(id).orElse(null);

        if (existingLead != null) {

            existingLead.setFullName(lead.getFullName());
            existingLead.setEmail(lead.getEmail());
            existingLead.setPhoneNumber(lead.getPhoneNumber());
            existingLead.setCompany(lead.getCompany());
            existingLead.setStatus(lead.getStatus());
            existingLead.setNotes(lead.getNotes());

            return leadRepository.save(existingLead);
        }

        return null;
    }


    public void deleteLead(Long id) {
        leadRepository.deleteById(id);
    }
}