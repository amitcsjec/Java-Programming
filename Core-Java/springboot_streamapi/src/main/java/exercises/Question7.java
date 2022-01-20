// Get a list of orders which were ordered on 15-Mar-2021, log the order records to the console and then return its product list

package com.hcl.exercises;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.dao.OrderRepository;
import com.hcl.entity.Product;

public class Question7 {
	
	@Autowired
	private OrderRepository orderRepo;

	public void productList() {
	List<Product> result = orderRepo.findAll()
		    .stream()
		    .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
		    .peek(o -> System.out.println(o.toString()))
		    .flatMap(o -> o.getProducts().stream())
		    .distinct()
		    .collect(Collectors.toList());
	System.out.println(result);
	}
}
