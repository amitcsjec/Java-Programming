// Get the most expensive product by category


package com.hcl.exercises;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.dao.ProductRepository;
import com.hcl.entity.Product;

public class Question15 {

	@Autowired
	private ProductRepository productRepo;

	public void expensiveProductCategory() {
	Map<String, Optional<Product>> result = productRepo.findAll()
	        .stream()
	        .collect(
	            Collectors.groupingBy(
	                Product::getCategory,
	                Collectors.maxBy(Comparator.comparing(Product::getPrice))));
	System.out.println(result);
	}
}
