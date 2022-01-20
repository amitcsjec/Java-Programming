// Get the 3 most recent placed order

package com.hcl.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.dao.OrderRepository;
import com.hcl.entity.Order;

public class Question6 {
	
	@Autowired
	private OrderRepository orderRepo;

	public void recentPlacedOrder() {
	List<Order> result = orderRepo.findAll()
	        .stream()
	        .sorted(Comparator.comparing(Order::getOrderDate).reversed())
	        .limit(3)
	        .collect(Collectors.toList());
	System.out.println(result);
	}
}
