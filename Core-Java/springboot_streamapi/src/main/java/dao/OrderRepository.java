package com.hcl.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.entity.Order;

public interface OrderRepository extends JpaRepository<Order, String> {

	List<Order> findById(int id);
}
