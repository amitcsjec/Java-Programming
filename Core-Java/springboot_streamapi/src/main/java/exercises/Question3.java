// Obtain a list of product with category = “Toys” and then apply 10% discount

package com.hcl.exercises;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.dao.ProductRepository;
import com.hcl.entity.Product;

public class Question3 {
	
	@Autowired
	private ProductRepository productRepo;

	public void listToyProducts() {
	List<Product> result = productRepo.findAll()
	        .stream()
	        .filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
	        .map(p ->{
	        	p.setPrice(p.getPrice() * 0.9);
				return p;
	        })
	        .collect(Collectors.toList());
	System.out.println(result);
	}
}
