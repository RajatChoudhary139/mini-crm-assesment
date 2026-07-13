package com.crm.crm_backend.service;

import org.springframework.stereotype.Service;

import com.crm.crm_backend.entity.Customer;
import com.crm.crm_backend.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;


    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }


    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }


    public Customer updateCustomer(Long id, Customer customer) {

        Customer existingCustomer = customerRepository.findById(id).orElse(null);

        if (existingCustomer != null) {

            existingCustomer.setName(customer.getName());
            existingCustomer.setEmail(customer.getEmail());
            existingCustomer.setPhone(customer.getPhone());
            existingCustomer.setCompany(customer.getCompany());
            existingCustomer.setNotes(customer.getNotes());

            return customerRepository.save(existingCustomer);
        }

        return null;
    }


    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}