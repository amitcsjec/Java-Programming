// Calculate order average payment placed on 14-Mar-2021

package com.hcl.exercises;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.dao.OrderRepository;

public class Question9 {

	@Autowired
	private OrderRepository orderRepo;

	public void orderAveragePayment() {
	Double result = orderRepo.findAll()
	        .stream()
	        .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
	        .flatMap(o -> o.getProducts().stream())
	        .mapToDouble(p -> p.getPrice())
	        .average().getAsDouble();
	System.out.println(result);
	}
}
