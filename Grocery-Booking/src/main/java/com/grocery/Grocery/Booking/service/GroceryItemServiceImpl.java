package com.grocery.Grocery.Booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.Grocery.Booking.Model.GroceryItem;
import com.grocery.Grocery.Booking.Repository.GroceryItemRepository;
@Service
public class GroceryItemServiceImpl implements GroceryItemService {
 @Autowired
 private GroceryItemRepository repository;

@Override
public List<GroceryItem> getAllItems() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public GroceryItem addItem(GroceryItem item) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void removeItem(Long itemId) {
	// TODO Auto-generated method stub
	
}

@Override
public GroceryItem updateItem(Long itemId, GroceryItem updateItem) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void manageInventory(Long itemId, int quantity) {
	// TODO Auto-generated method stub
	
}
}
