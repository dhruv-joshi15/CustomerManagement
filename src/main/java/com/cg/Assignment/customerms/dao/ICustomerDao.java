package com.cg.Assignment.customerms.dao;

import com.cg.Assignment.customerms.entities.Customer;

public interface ICustomerDao {
	
	public Customer add(Customer customer);
    public Customer findByID(Long customerID);
    public Customer update(Customer customer);

}