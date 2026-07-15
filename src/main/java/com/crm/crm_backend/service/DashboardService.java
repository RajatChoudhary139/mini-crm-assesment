package com.crm.crm_backend.service;

import org.springframework.stereotype.Service;

import com.crm.crm_backend.dto.DashboardResponse;
import com.crm.crm_backend.repository.CustomerRepository;
import com.crm.crm_backend.repository.LeadRepository;
import com.crm.crm_backend.repository.TaskRepository;
import java.util.HashMap;
import java.util.Map;

@Service
public class DashboardService {

    private final LeadRepository leadRepository;
    private final CustomerRepository customerRepository;
    private final TaskRepository taskRepository;

    public DashboardService(
            LeadRepository leadRepository,
            CustomerRepository customerRepository,
            TaskRepository taskRepository) {

        this.leadRepository = leadRepository;
        this.customerRepository = customerRepository;
        this.taskRepository = taskRepository;
    }

    public DashboardResponse getDashboardData() {

        long totalLeads = leadRepository.count();
        long totalCustomers = customerRepository.count();
        long totalTasks = taskRepository.count();

        Map<String, Long> leadsByStatus = new HashMap<>();

        leadsByStatus.put("NEW",
                leadRepository.findByStatusIgnoreCase("NEW").size() * 1L);

        leadsByStatus.put("CONTACTED",
                leadRepository.findByStatusIgnoreCase("CONTACTED").size() * 1L);

        leadsByStatus.put("QUALIFIED",
                leadRepository.findByStatusIgnoreCase("QUALIFIED").size() * 1L);

        leadsByStatus.put("WON",
                leadRepository.findByStatusIgnoreCase("WON").size() * 1L);

        leadsByStatus.put("LOST",
                leadRepository.findByStatusIgnoreCase("LOST").size() * 1L);

        return new DashboardResponse(
                totalLeads,
                totalCustomers,
                totalTasks,
                leadsByStatus
        );
    }}