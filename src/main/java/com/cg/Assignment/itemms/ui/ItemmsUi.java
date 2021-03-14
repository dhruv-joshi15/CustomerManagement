package com.cg.Assignment.itemms.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.Assignment.itemms.entities.Item;
import com.cg.Assignment.itemms.service.IItemService;

@Component
public class ItemmsUi {
	
		@Autowired
		private IItemService service;
		public void start() {
			Item item1 = service.create(25000.0, "Nike Hypervenom Boots");
			Item item2 = service.create(20000.0, "Nike Mercural Boots");
			Item fetchedItem = service.findByID(item1.getId());
			System.out.println("Added Item  : "+ item1);
			System.out.println("Fetched item : "+ fetchedItem);
		}

}
