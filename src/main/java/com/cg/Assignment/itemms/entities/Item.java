package com.cg.Assignment.itemms.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.cg.Assignment.customerms.entities.Customer;
@Entity
public class Item {
	@Id
	private String id;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	private Double price;
	public Customer getBought() {
		return bought;
	}

	public void setBought(Customer bought) {
		this.bought = bought;
	}

	private String description;
	private LocalDateTime addedDate;
	@ManyToOne
	private Customer bought;
	
	public Item() {
		
	}
	public Item( Double price, String description, LocalDateTime addedDate) {
		setPrice(price);
		setDescription(description);
		setAddedDate(addedDate);
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", price=" + price + ", description=" + description + ", addedDate=" + addedDate
				+ "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(LocalDateTime addedDate) {
		this.addedDate = addedDate;
	}
}
