package com.cg.Assignment.customerms.service;

import com.cg.Assignment.customerms.entities.Customer;

public interface ICustomerService {
	
	public Customer findByID(Long customerID);
    public Customer createCustomer(String name);

}