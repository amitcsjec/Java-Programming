// Obtain a list of products belongs to category “Books” with price > 100

package com.hcl.exercises;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.dao.ProductRepository;
import com.hcl.entity.Product;

public class Question1 {

	@Autowired
	private ProductRepository productRepo;

	public void listBooks() {
	List<Product> result = productRepo.findAll()
			.stream()
			  .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
			  .filter(p -> p.getPrice() > 100)
			  .collect(Collectors.toList());
	System.out.println(result);
	}
}
