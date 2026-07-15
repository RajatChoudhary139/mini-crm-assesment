package com.crm.crm_backend.service;

import org.springframework.stereotype.Service;

import com.crm.crm_backend.entity.Lead;
import com.crm.crm_backend.repository.LeadRepository;

import java.util.List;

import com.crm.crm_backend.entity.Customer;
import com.crm.crm_backend.repository.CustomerRepository;


@Service
public class LeadService {
	
	private final ActivityService activityService;

    private final LeadRepository leadRepository;
    
    private final CustomerRepository customerRepository;


    public LeadService(LeadRepository leadRepository,
            CustomerRepository customerRepository,
            ActivityService activityService) {

    	this.leadRepository = leadRepository;
    	this.customerRepository = customerRepository;
    	this.activityService = activityService;
}


    public Lead createLead(Lead lead) {

        Lead savedLead = leadRepository.save(lead);

        activityService.logActivity(
                "LEAD_CREATED",
                "Lead created: " + savedLead.getFullName());

        return savedLead;
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

            Lead updatedLead = leadRepository.save(existingLead);

            activityService.logActivity(
                    "LEAD_UPDATED",
                    "Lead updated: " + updatedLead.getFullName());

            return updatedLead;
        }

        return null;
    }


    public void deleteLead(Long id) {
        leadRepository.deleteById(id);
    }
    

    public List<Lead> searchByFullName(String fullName) {
        return leadRepository.findByFullNameContainingIgnoreCase(fullName);
    }

    public List<Lead> searchByEmail(String email) {
        return leadRepository.findByEmailContainingIgnoreCase(email);
    }

    public List<Lead> searchByCompany(String company) {
        return leadRepository.findByCompanyContainingIgnoreCase(company);
    }
    
    public List<Lead> filterByStatus(String status) {
        return leadRepository.findByStatusIgnoreCase(status);
    }
    
    public Customer convertLeadToCustomer(Long leadId) {

        Lead lead = leadRepository.findById(leadId).orElse(null);

        if (lead == null) {
            return null;
        }

        Customer customer = new Customer();

        customer.setName(lead.getFullName());
        customer.setEmail(lead.getEmail());
        customer.setPhone(lead.getPhoneNumber());
        customer.setCompany(lead.getCompany());
        customer.setNotes(lead.getNotes());

        Customer savedCustomer = customerRepository.save(customer);

        activityService.logActivity(
                "LEAD_CONVERTED",
                "Lead converted to customer: " + lead.getFullName());

        leadRepository.delete(lead);

        return savedCustomer;
    }
}