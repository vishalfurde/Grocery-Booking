package com.grocery.Grocery.Booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocery.Grocery.Booking.Model.GroceryItem;
import com.grocery.Grocery.Booking.Model.OrderItem;
import com.grocery.Grocery.Booking.Repository.GroceryItemRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private GroceryItemRepository groceryItemRepository;

	@Override
	public List<GroceryItem> getAItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createOrder(List<OrderItem> orderItems) {
		// TODO Auto-generated method stub
		
	}

}
