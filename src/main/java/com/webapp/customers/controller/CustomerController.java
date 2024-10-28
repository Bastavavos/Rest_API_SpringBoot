package com.webapp.customers.controller;

import com.webapp.customers.model.Customer;
import com.webapp.customers.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAll();
    }

    @GetMapping("customers/{id}")
    public Customer getById(@PathVariable int id) {
        return customerService.getById(id);
    }

    @PostMapping("customers")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("customers/{id}")
    public Customer updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
        customer.setId(id);
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("customers/{id}")
    public void deleteById(@PathVariable int id) {
        customerService.deleteCustomer(customerService.getById(id));
    }

    @DeleteMapping("customers")
    public void deleteAll() {
        customerService.deleteAll();
    }
}
