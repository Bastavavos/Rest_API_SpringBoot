package com.webapp.customers.dao;

import com.webapp.customers.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface CustomerDao extends CrudRepository<Customer, Integer> {
    List<Customer> findAll();
    Customer findById(int id);
}
