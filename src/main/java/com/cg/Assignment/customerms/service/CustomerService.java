package com.cg.Assignment.customerms.service;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Assignment.customerms.dao.ICustomerDao;
import com.cg.Assignment.customerms.entities.Account;
import com.cg.Assignment.customerms.entities.Customer;
import com.cg.Assignment.customerms.exceptions.CustomerNameNotFoundException;



@Service
public class CustomerService implements ICustomerService {
	
	@Autowired
	private ICustomerDao dao;
	
	@Autowired
	private EntityManager em;

	@Override
	public Customer findByID(Long customerID) {
		Customer customer=dao.findByID(customerID);
		return customer;
	}

	@Transactional
	@Override
	public Customer createCustomer(String name) {
		LocalDateTime currentTime=LocalDateTime.now();
		Account account=new Account(-1,currentTime);
		em.persist(account);
		Customer customer=new Customer(name,account);
		return dao.add(customer);
	}
	public void validateName(String name)
	{
		if (name == null || name.isEmpty() || name.trim().isEmpty()) {
			throw new CustomerNameNotFoundException("Name cannot be null");
			
		}
	}

}
