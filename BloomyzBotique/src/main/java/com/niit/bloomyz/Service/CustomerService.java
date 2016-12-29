package com.niit.bloomyz.Service;

import java.util.List;

import com.niit.bloomyz.model.Customer;


public interface CustomerService {

    void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername (String username);
}
