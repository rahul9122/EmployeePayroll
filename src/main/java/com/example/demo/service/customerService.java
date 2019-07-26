package com.example.demo.service;

import java.util.*;

import com.example.demo.model.Customer;

public interface customerService {
	public List<Customer> getAllCustomer();
	 
	 public Customer getCustomerById(int id);
	 
	 public Customer addCustomer(Customer customer);
	 
	 public void updateCustomer(Customer customer);
	 
	 public void deleteCustomer(int id);

}
