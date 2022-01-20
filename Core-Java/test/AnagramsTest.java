package com.hcl.junit.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.hcl.assessment.Anagrams;

class AnagramsTest {

	@Test
	public void whenAnagramIsCalled_ThenCorrectStringIsReturned() {
		String arr[] = { "cat", "dog", "tac", "god", "act" };
		List<String> result = Anagrams.printAnagrams(arr);
		assertNotNull(result);
	}

}
