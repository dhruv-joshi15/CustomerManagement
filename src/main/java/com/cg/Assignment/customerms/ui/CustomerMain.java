package com.cg.Assignment.customerms.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.Assignment.customerms.entities.Customer;
import com.cg.Assignment.customerms.service.ICustomerService;

@Component
public class CustomerMain {
	
	@Autowired
	private ICustomerService service;
	
	
	public void start() {
		
		Customer c1=service.createCustomer("Dhruv Joshi");
		System.out.println(c1);
		Customer c2=service.createCustomer("Pranjal Sharma");
		System.out.println(c2);
		
		Customer findC1=service.findByID(c1.getId());
		System.out.println("Customer found with id "+ findC1.getId()+ "And name= "+findC1.getName());
		Customer findC2=service.findByID(c2.getId());
		System.out.println("Customer found with id "+ findC2.getId()+ "And name= "+findC2.getName());
		
		
		
	}

}