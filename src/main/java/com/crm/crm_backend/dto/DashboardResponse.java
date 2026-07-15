package com.crm.crm_backend.dto;
import java.util.Map;

public class DashboardResponse {

    private long totalLeads;
    private long totalCustomers;
    private long totalTasks;
    private Map<String, Long> leadsByStatus;

    public DashboardResponse() {
    }

    public DashboardResponse(long totalLeads,
            long totalCustomers,
            long totalTasks,
            Map<String, Long> leadsByStatus) {

this.totalLeads = totalLeads;
this.totalCustomers = totalCustomers;
this.totalTasks = totalTasks;
this.leadsByStatus = leadsByStatus;
}
    

    public long getTotalLeads() {
        return totalLeads;
    }

    public void setTotalLeads(long totalLeads) {
        this.totalLeads = totalLeads;
    }

    public long getTotalCustomers() {
        return totalCustomers;
    }

    public void setTotalCustomers(long totalCustomers) {
        this.totalCustomers = totalCustomers;
    }

    public long getTotalTasks() {
        return totalTasks;
    }

    public void setTotalTasks(long totalTasks) {
        this.totalTasks = totalTasks;
    }
    
    public Map<String, Long> getLeadsByStatus() {
        return leadsByStatus;
    }
    
    public void setLeadsByStatus(Map<String, Long> leadsByStatus) {
        this.leadsByStatus = leadsByStatus;
    }
}