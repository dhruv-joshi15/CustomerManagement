package com.cg.Assignment.itemms.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Assignment.itemms.dao.IItemDao;
import com.cg.Assignment.itemms.entities.Item;
import com.cg.Assignment.itemms.exceptions.InvalidDescriptionException;
import com.cg.Assignment.itemms.exceptions.InvalidIdException;
import com.cg.Assignment.itemms.exceptions.InvalidPriceException;
  @Service
public class ItemService implements IItemService {
	
		@Autowired
		private IItemDao itemDao;

		@Override
		public Item create(Double price, String description) {
			validatePrice(price);
			validateDescription(description);
			LocalDateTime addedTime = LocalDateTime.now();
			Item item = new Item(price, description, addedTime);
			itemDao.add(item);
			return item;
		}

		@Override
		public Item findByID(String itemID) {
			validateItemId(itemID);
			Item item = itemDao.findByID(itemID);
			return item;
		}

		@Override
		public Item buyItem(String itemID, Long customerID) {
			return null;
		}
		public void validateItemId(String itemId) {
			if (itemId == null || itemId.isEmpty() || itemId.trim().isEmpty()) {
				throw new InvalidIdException("Item ID cannot be null");
			}
			}
		public void validatePrice(Double price) {
			if(price <= 0) {
				throw new InvalidPriceException("Price cannot be less than or equal to zero" + price);
			}
		}
		public void validateDescription(String description) {
			if (description == null || description.isEmpty() || description.trim().isEmpty()) {
				throw new InvalidDescriptionException("Item Description cannot be null");
			}
		}
	}


