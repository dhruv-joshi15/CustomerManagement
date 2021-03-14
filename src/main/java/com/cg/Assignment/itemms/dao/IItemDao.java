package com.cg.Assignment.itemms.dao;

import com.cg.Assignment.itemms.entities.Item;

public interface IItemDao {
	Item add(Item item);
    Item update(Item item);
    Item findByID(String itemID);
}
