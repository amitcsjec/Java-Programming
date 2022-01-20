// Calculate total lump sum of all orders placed in Feb 2021

package com.hcl.exercises;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.dao.OrderRepository;

public class Question8 {

	@Autowired
	private OrderRepository orderRepo;

	public void lumpSumOrder() {
	Double result = orderRepo.findAll()
		    .stream()
		    .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
		    .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
		    .flatMap(o -> o.getProducts().stream())
		    .mapToDouble(p -> p.getPrice())
		    .sum();
	System.out.println(result);
	}
}
