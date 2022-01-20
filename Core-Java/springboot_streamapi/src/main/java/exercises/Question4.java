// Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021

package com.hcl.exercises;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.dao.OrderRepository;
import com.hcl.entity.Product;

public class Question4 {
	
	@Autowired
	private OrderRepository orderRepo;

	public void listTier2Products() {
	List<Product> result = orderRepo.findAll()
			  .stream()
			  .filter(o -> o.getCustomer().getTier() == 2)
			  .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
			  .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
			  .flatMap(o -> o.getProducts().stream())
			  .distinct()
			  .collect(Collectors.toList());
	System.out.println(result);
	}
}
