// Produce a data map with order record and product total sum

package com.hcl.exercises;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.dao.OrderRepository;
import com.hcl.entity.Order;

public class Question13 {

	@Autowired
	private OrderRepository orderRepo;

	public void dataMapOrderRecordAndSum() {
	Map<Order, Double> result = orderRepo.findAll()
	        .stream()
	        .collect(
	          Collectors.toMap(
	              Function.identity(), 
	              order -> order.getProducts().stream()
	                    .mapToDouble(p -> p.getPrice()).sum()
	            ) 
	          );
	System.out.println(result);
	}
}
