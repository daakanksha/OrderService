package com.test.ordersservice.service;

import java.util.List;
import java.util.Optional;

import com.test.ordersservice.model.Orders;

public interface OrdersService {
	public List<Orders> getAll();
	public Orders addOrder(Orders o);
	public Optional<Orders> findById(int orderid);
	public List<Orders> searchByUserId(String userid);
	public List<Orders> searchByRestaurantId(int id);
	
}
