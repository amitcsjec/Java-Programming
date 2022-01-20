package com.hcl.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_order")
public class Order {

	public Order(int i, String string, LocalDate date1, LocalDate date2, Customer customer1, List<Product> products2) {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	@ManyToMany
	@JoinTable(name = "order_product_relationship", joinColumns = {
			@JoinColumn(name = "order_id") }, inverseJoinColumns = { @JoinColumn(name = "product_id") })

	@ToString.Exclude
	private List<Product> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
