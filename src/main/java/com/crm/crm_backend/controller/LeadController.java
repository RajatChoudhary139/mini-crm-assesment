package com.crm.crm_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.crm.crm_backend.entity.Lead;
import com.crm.crm_backend.service.LeadService;

@RestController
@RequestMapping("/api/leads")
@CrossOrigin
public class LeadController {

    private final LeadService leadService;


    public LeadController(LeadService leadService) {
        this.leadService = leadService;
    }


    @PostMapping
    public Lead createLead(@RequestBody Lead lead) {
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
            @RequestBody Lead lead) {

        return leadService.updateLead(id, lead);
    }


    @DeleteMapping("/{id}")
    public String deleteLead(@PathVariable Long id) {

        leadService.deleteLead(id);

        return "Lead deleted successfully";
    }
}