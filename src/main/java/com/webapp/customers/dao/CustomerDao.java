package com.webapp.customers.dao;

import com.webapp.customers.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface CustomerDao {
    List<Customer> findAll();
    Customer findById(int id);
    Customer save(Customer customer);
    Customer update(Customer customer);
    void delete(Customer customer);
}
