package com.test.ordersservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.ordersservice.dao.OrdersDao;
import com.test.ordersservice.model.Orders;

@Service
public class OrdersServiceImp implements OrdersService{
	
	@Autowired
	OrdersDao dao;

	@Override
	public List<Orders> getAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Orders addOrder(Orders o) {
		// TODO Auto-generated method stub
		return dao.save(o);
	}

	@Override
	public Optional<Orders> findById(int orderid) {
		// TODO Auto-generated method stub
		return dao.findById(orderid);
	}

	@Override
	public List<Orders> searchByUserId(String userid) {
		// TODO Auto-generated method stub
		return dao.searchByUserId(userid);
	}

	@Override
	public List<Orders> searchByRestaurantId(int id) {
		// TODO Auto-generated method stub
		return dao.searchByRestaurantId(id);
	}

}
