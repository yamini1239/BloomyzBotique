package com.niit.bloomyz.Dao;

import java.util.List;

import com.niit.bloomyz.model.Customer;


public interface CustomerDao {

    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername (String username);

}
