package com.webapp.customers.service;

import com.webapp.customers.dao.CustomerDao;
import com.webapp.customers.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CustomerService {

    CustomerDao dao;

    public CustomerService(CustomerDao dao) {
        this.dao = dao;
    }

    public List<Customer> getAll() {
        return dao.findAll();
    }

    public Customer getById(int id) {
        return dao.findById(id);
    }

    public Customer createCustomer(Customer customer) {
        checkLicense(customer.getLicenseNumber());
        return dao.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        checkLicense(customer.getLicenseNumber());
        return dao.save(customer);
    }

    public void deleteCustomer(Customer customer) {
        dao.delete(customer);
    }

    public void deleteAll(){
        dao.deleteAll();
    }

    public void checkLicense(String licenseNumber){
        if (!licenseNumber.matches("^[a-zA-Z0-9]{9}$")) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_ACCEPTABLE, "406 - License format not acceptable"
            );
        }

        RestTemplate restTemplate = new RestTemplate();
        Boolean isValid = restTemplate.getForObject("http://localhost:8081/licenses/" + licenseNumber, Boolean.class);
        if (isValid == null || !isValid ) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "400 - Invalid license"
            );
        }
    }
}
