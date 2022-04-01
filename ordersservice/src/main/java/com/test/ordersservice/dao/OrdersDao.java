package com.test.ordersservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.ordersservice.model.Orders;

@Repository
@Transactional
public interface OrdersDao extends JpaRepository<Orders,Integer>{
	
	@Query("Select o from Orders o where o.userid=?1")
	public List<Orders> searchByUserId(String userid);
	
	@Query("Select o from Orders o where o.rid=?1")
	public List<Orders> searchByRestaurantId(int rid);
	
}
