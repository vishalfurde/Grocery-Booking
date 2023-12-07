package com.grocery.Grocery.Booking.service.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.Grocery.Booking.Model.GroceryItem;
import com.grocery.Grocery.Booking.service.GroceryItemService;

@RestController
@RequestMapping("/api/admin/groceries")
public class GroceryItemController {
	
	
	@Autowired
	private GroceryItemService groceryItemService;
	
	@GetMapping("/items")
	public List <GroceryItem>getAllGroceryItems(){
		return Collections.emptyList();
		
	}
	

}
