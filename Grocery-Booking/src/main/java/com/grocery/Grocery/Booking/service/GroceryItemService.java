package com.grocery.Grocery.Booking.service;

import java.util.List;

import com.grocery.Grocery.Booking.Model.GroceryItem;

public interface GroceryItemService {
	List<GroceryItem>getAllItems();
	GroceryItem addItem(GroceryItem item);
	void removeItem(Long itemId);
	GroceryItem updateItem(Long itemId,GroceryItem updateItem);
	void manageInventory(Long itemId,int quantity);
	
	
	

}
