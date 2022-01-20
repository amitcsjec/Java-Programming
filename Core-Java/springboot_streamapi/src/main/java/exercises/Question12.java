// Produce a data map with order records grouped by customer

package com.hcl.exercises;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.dao.OrderRepository;
import com.hcl.entity.Customer;
import com.hcl.entity.Order;

public class Question12 {
	
	@Autowired
	private OrderRepository orderRepo;

	public void dataMapCustomer() {
	Map<Customer, List<Order>> result = orderRepo.findAll()
	        .stream()
	        .collect(
	            Collectors.groupingBy(Order::getCustomer)
	            );
	System.out.println(result);
	}
}
