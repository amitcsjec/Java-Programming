package com.hcl.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

	List<Product> findById(int id);
}
