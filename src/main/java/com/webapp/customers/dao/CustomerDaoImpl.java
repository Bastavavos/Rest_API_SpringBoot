//package com.webapp.customers.dao;

//import com.webapp.customers.model.Customer;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;

//@Repository
//public class CustomerDaoImpl implements CustomerDao {
//    public static List<Customer> customers = new ArrayList<>();
//
//    @Override
//    public List<Customer> findAll() {
//        return customers;
//    }
//
//    @Override
//    public Customer findById(int id) {
////        return customers.stream().filter(customer -> customer.getId() == id).findFirst().orElse(null);
//        for (Customer customer : customers) {
//            if (customer.getId() == id) {
//                return customer;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public Customer save(Customer customer) {
//        customers.add(customer);
//        return customer;
//    }
//
//    @Override
//    public Customer update(Customer customer) {
//        for (Customer c : customers) {
//            if (c.getId() == customer.getId()) {
//                c.setFirstname(customer.getFirstname());
//                c.setLastname(customer.getLastname());
//                c.setDateOfBirth(customer.getDateOfBirth());
//                c.setLicenseNumber(customer.getLicenseNumber());
//                return c;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void delete(Customer customer) {
//        customers.remove(customer);
//    }
//}
