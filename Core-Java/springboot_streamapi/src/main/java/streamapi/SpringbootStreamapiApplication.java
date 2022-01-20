package com.hcl.streamapi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hcl.entity.Customer;
import com.hcl.entity.Order;
import com.hcl.entity.Product;

@SpringBootApplication
public class SpringbootStreamapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStreamapiApplication.class, args);

		List<Order> orders = new ArrayList<>();
		
		List<Product> products = new ArrayList<>();
		Product product1 = new Product();
		Product product2 = new Product();
		products.add(product1);
		products.add(product2);
		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = date1.plusDays(2);
		
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
		Order order1 = new Order(1, "Yes", date1, date2, customer1, products);
		Order order2 = new Order(2, "Yes", date1, date2, customer2, products);
		Order order3 = new Order(3, "Yes", date1, date2, customer1, products);
		Order order4 = new Order(4, "No", date1, date2, customer2, products);
		Order order5 = new Order(5, "Yes", date1, date2, customer1, products);
		Order order6 = new Order(6, "Yes", date1, date2, customer2, products);
		Order order7 = new Order(7, "Yes", date1, date2, customer2, products);
		Order order8 = new Order(8, "Yes", date1, date2, customer2, products);
		Order order9 = new Order(9, "Yes", date1, date2, customer2, products);
		Order order10 = new Order(10, "Yes", date1, date2, customer2, products);

		Set<Order> orderset = new HashSet<Order>();
		orderset.add(order1);
		orderset.add(order2);

		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);

		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);
		orders.add(order5);
		orders.add(order6);
		orders.add(order7);
		orders.add(order8);
		orders.add(order9);
		orders.add(order10);
	}

}
