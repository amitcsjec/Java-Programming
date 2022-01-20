package com.hcl.assessment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparatedString {

	public static String getString(List<Integer> list) {
		return list.stream().map(i -> i % 2 == 0 ? "e" + i : "o" + i).collect(Collectors.joining(","));
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list = Arrays.asList(3, 44, 2, 4, 1, 9);
		String result = getString(list);
		System.out.println(result);
	}

}
