// Obtain a collection of statistic figures (i.e. sum, average, max, min, count) for all products of category “Books”

package com.hcl.exercises;

import java.util.DoubleSummaryStatistics;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.dao.ProductRepository;

public class Question10 {

	@Autowired
	private ProductRepository productRepo;

	public void printDoubleSummaryStatistics() {

		DoubleSummaryStatistics statistics = productRepo.findAll().stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books")).mapToDouble(p -> p.getPrice())
				.summaryStatistics();

		System.out.println("count = " + statistics.getCount() + ", Average = " + statistics.getAverage() + ", Max = "
				+ statistics.getMax() + ", Min = " + statistics.getMin() + ", sum = " + statistics.getSum());

	}
}
