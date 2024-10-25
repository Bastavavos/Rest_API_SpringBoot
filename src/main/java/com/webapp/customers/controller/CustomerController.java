package com.webapp.customers.controller;

import com.webapp.customers.dao.CustomerDao;
import com.webapp.customers.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    private final CustomerDao customerDao;

    public CustomerController(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @GetMapping("customers")
    public List<Customer> getAllCustomers() {
        return customerDao.findAll();
    }

    @GetMapping("customers/{id}")
    public Customer getById(@PathVariable int id) {
        return customerDao.findById(id);
    }

    @PostMapping("customers")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerDao.save(customer);
    }

    @PutMapping("customers/{id}")
    public Customer updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
        return customerDao.update(customer);
    }

    @DeleteMapping("customers/{id}")
    public void deleteById(@PathVariable int id) {
        customerDao.delete(customerDao.findById(id));
    }
}
