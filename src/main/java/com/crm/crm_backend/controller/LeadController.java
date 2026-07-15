package com.crm.crm_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.crm.crm_backend.entity.Lead;
import com.crm.crm_backend.service.LeadService;

import com.crm.crm_backend.entity.Customer;

@RestController
@RequestMapping("/api/leads")
@CrossOrigin
public class LeadController {

    private final LeadService leadService;


    public LeadController(LeadService leadService) {
        this.leadService = leadService;
    }


    @PostMapping
    public Lead createLead(@jakarta.validation.Valid @RequestBody Lead lead) {
        return leadService.createLead(lead);
    }
    


    @GetMapping
    public List<Lead> getAllLeads() {
        return leadService.getAllLeads();
    }


    @GetMapping("/{id}")
    public Lead getLeadById(@PathVariable Long id) {
        return leadService.getLeadById(id);
    }


    @PutMapping("/{id}")
    public Lead updateLead(
            @PathVariable Long id,
            @jakarta.validation.Valid @RequestBody Lead lead) {

        return leadService.updateLead(id, lead);
    }


    @DeleteMapping("/{id}")
    public String deleteLead(@PathVariable Long id) {

        leadService.deleteLead(id);

        return "Lead deleted successfully";
    }
    
    @GetMapping("/search/name")
    public List<Lead> searchByFullName(
            @RequestParam String fullName) {

        return leadService.searchByFullName(fullName);
    }

    @GetMapping("/search/email")
    public List<Lead> searchByEmail(
            @RequestParam String email) {

        return leadService.searchByEmail(email);
    }

    @GetMapping("/search/company")
    public List<Lead> searchByCompany(
            @RequestParam String company) {

        return leadService.searchByCompany(company);
    }
    
    @GetMapping("/filter/status")
    public List<Lead> filterByStatus(
            @RequestParam String status) {

        return leadService.filterByStatus(status);
    }
    
    @PostMapping("/{id}/convert")
    public Customer convertLeadToCustomer(@PathVariable Long id) {

        return leadService.convertLeadToCustomer(id);
    }
}