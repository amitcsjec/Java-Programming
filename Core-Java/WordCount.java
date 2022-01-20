package com.hcl.assessment;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static Map<String, Integer> getNumberOfWords(String input) {
		Map<String, Integer> hashMap = new HashMap<>();
		String[] words = input.split(" ");

		for (String word : words) {
			Integer integer = hashMap.get(word);

			if (integer == null) {
				hashMap.put(word, 1);
			} else {
				hashMap.put(word, integer + 1);
			}
		}
		return hashMap;
	}

	static final int NO_OF_CHARS = 256;
	static char count[] = new char[NO_OF_CHARS];

	/* calculate count of characters in the passed string */
	static void getCharCountArray(String str) {
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
	}

	public static void main(String[] args) {

		String str = "Alice is girl and Bob is boy";
		Map<String, Integer> hashMap = new HashMap<>();
		String[] words = str.split(" ");

		for (String word : words) {
			Integer integer = hashMap.get(word);

			if (integer == null)
				hashMap.put(word, 1);
			else
				hashMap.put(word, integer + 1);
		}

		System.out.println(hashMap);
	}

}
