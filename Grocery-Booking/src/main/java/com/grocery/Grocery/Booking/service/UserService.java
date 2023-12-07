package com.grocery.Grocery.Booking.service;

import java.util.List;

import com.grocery.Grocery.Booking.Model.GroceryItem;
import com.grocery.Grocery.Booking.Model.OrderItem;

public interface UserService {
List<GroceryItem>getAItems();
void createOrder(List<OrderItem>orderItems);
}
