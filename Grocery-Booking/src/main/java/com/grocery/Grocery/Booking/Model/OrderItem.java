package com.grocery.Grocery.Booking.Model;

public class OrderItem {
	private Long groceryId;
	private int quantity;
	/**
	 * @param groceryId
	 * @param quantity
	 */
	public OrderItem(Long groceryId, int quantity) {
		super();
		this.groceryId = groceryId;
		this.quantity = quantity;
	}

}
