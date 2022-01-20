// Get the cheapest products of “Books” category

package com.hcl.exercises;

import java.util.Comparator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.dao.ProductRepository;
import com.hcl.entity.Product;

public class Question5 {
	
	@Autowired
	private ProductRepository productRepo;

	/*
	 * Optional<Product> result = productRepo.findAll() .stream() .filter(p ->
	 * p.getCategory().equalsIgnoreCase("Books"))
	 * .sorted(Comparator.comparing(Product::getPrice)) .findFirst();
	 */
	
	public void listChepestBooks() {
	Optional<Product> result = productRepo.findAll()
	        .stream()
	        .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
	        .min(Comparator.comparing(Product::getPrice));
	System.out.println(result);
	}
}
