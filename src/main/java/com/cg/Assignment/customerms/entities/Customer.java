package com.cg.Assignment.customerms.entities;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.cg.Assignment.itemms.entities.Item;


@Entity
public class Customer {
	
	
	@GeneratedValue
	@Id
	private Long id;
    public Set<Item> getBoughtItems() {
		return boughtItems;
	}

	public void setBoughtItems(Set<Item> boughtItems) {
		this.boughtItems = boughtItems;
	}

	private String name;
    
    @OneToOne
    Account account;
    @OneToMany(fetch = FetchType.EAGER)
    Set<Item>boughtItems;
    
    public Customer() {}

	public Customer(String name, Account account) {
		this.name = name;
		this.account = account;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", account=" + account + "]";
	}
	
	
    
 
}