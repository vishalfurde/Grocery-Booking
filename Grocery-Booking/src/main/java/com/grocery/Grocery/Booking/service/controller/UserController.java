package com.grocery.Grocery.Booking.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocery.Grocery.Booking.service.UserService;

@RestController
@RequestMapping("/api/user/groceries")
public class UserController {
	
	@Autowired
	private UserService userService;

}
