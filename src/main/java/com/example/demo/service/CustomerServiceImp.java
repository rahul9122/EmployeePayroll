package com.example.demo.service;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

import org.springframework.stereotype.Component;

import com.example.demo.model.Customer;

@Component
public class CustomerServiceImp implements customerService {

	private static List<Customer> customers = new ArrayList<>();
	 static int cid=1;
	 static {
	  Customer c1 = new Customer(cid++, "rahul");
	  Customer c2 = new Customer(cid++, "pranaye");
	  Customer c3 = new Customer(cid++, "addi");
	  
	  customers.add(c1);
	  customers.add(c2);
	  customers.add(c3);
	 }
	
	@Override
	public java.util.List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customers;
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		for(Customer customer : customers) {
			   if(customer.getId() == id) {
			    return customer;
			   }
			  }
			  return null;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		/* Random random = new Random();
		  int nextId = random.nextInt(1000) + 10;*/
		  
		  customer.setId(cid++);
		  customers.add(customer);
		  
		  return customer;
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		 for(Customer oldCustomer : customers) {
			   if(oldCustomer.getId() == customer.getId()) {
			    oldCustomer.setName(customer.getName());
			   
			   }
			  }
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		  for(Customer c : customers) {
			   if(c.getId() == id) {
			    customers.remove(c);
			    break;
			   }
			  }
			 
	}
	
}
