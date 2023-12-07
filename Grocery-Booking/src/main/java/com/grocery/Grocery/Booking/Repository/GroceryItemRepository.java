package com.grocery.Grocery.Booking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grocery.Grocery.Booking.Model.GroceryItem;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long>
 {

}
