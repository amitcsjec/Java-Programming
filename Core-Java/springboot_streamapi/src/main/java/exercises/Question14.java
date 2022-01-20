// Obtain a data map with list of product name by category

package com.hcl.exercises;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.dao.ProductRepository;
import com.hcl.entity.Product;

public class Question14 {
	
	@Autowired
	private ProductRepository productRepo;

	public void productNameByCategory() {
	Map<String, List<String>> result = productRepo.findAll()
	        .stream()
	        .collect(
	            Collectors.groupingBy(
	                Product::getCategory,
	                Collectors.mapping(product -> product.getName(), Collectors.toList()))
	            );
	System.out.println(result);
	}
}
