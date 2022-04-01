package com.test.ordersservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.ordersservice.model.Orders;
import com.test.ordersservice.service.OrdersService;

@RestController
@RequestMapping("orders")
public class OrdersController {
	
	@Autowired
	OrdersService service;
	

	@GetMapping("all")
	public ResponseEntity<List<Orders>> getAllOrders(){
		return new ResponseEntity<List<Orders>>(service.getAll(),HttpStatus.OK);
	}
	
	@PostMapping("add")
	public Orders addRestaurant(@RequestBody Orders o){
		
		return service.addOrder(o);
	}
	
	@GetMapping("search/order/{orderid}")
	public Optional<Orders> searchByOrderId(@PathVariable(name="orderid") int id){
		return service.findById(id);
	}
	
	@GetMapping("search/userid/{userid}")
	public ResponseEntity<List<Orders>> searchByUserId(@PathVariable(name="userid") String userid){
		return new ResponseEntity<List<Orders>>(service.searchByUserId(userid),HttpStatus.OK);
	}
	
	@GetMapping("search/rid/{rid}")
	public ResponseEntity<List<Orders>> searchByRestaurantId(@PathVariable(name="rid") int rid){
		return new ResponseEntity<List<Orders>>(service.searchByRestaurantId(rid),HttpStatus.OK);
	}
	
}
