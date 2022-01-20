// Obtain a list of order with products belong to category “Baby”

package com.hcl.exercises;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.dao.OrderRepository;
import com.hcl.entity.Order;

public class Question2 {

	@Autowired
	private OrderRepository orderRepo;

	public void listBabyProducts() {
		List<Order> result = orderRepo.findAll().stream()
				.filter(o -> o.getProducts().stream().anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby")))
				.collect(Collectors.toList());
		System.out.println(result);
	}
}
