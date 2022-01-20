// Obtain a data map with order id and order’s product count

package com.hcl.exercises;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.dao.OrderRepository;

public class Question11 {

	@Autowired
	private OrderRepository orderRepo;

	public void dataMap() {
	Map<Integer, Integer>  result = orderRepo.findAll()
	        .stream()
	        .collect(
	            Collectors.toMap(
	                order -> order.getId(),
	                order -> order.getProducts().size()
	                )
	            );
	System.out.println(result);
	}
}
