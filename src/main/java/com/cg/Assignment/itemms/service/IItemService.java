package com.cg.Assignment.itemms.service;

import com.cg.Assignment.itemms.entities.Item;

public interface IItemService {
		Item create(Double price, String description);

		Item findByID(String itemID);

		Item buyItem(String itemID, Long customerID);
	

}
