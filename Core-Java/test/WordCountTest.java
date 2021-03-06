package com.hcl.junit.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.hcl.assessment.WordCount;

public class WordCountTest {

	private final WordCount wordCount = new WordCount();

	@Test
	public void countOneWord() {
		Map<String, Integer> actualWordCount = new HashMap<>();
		final Map<String, Integer> expectedWordCount = new HashMap<>();
		expectedWordCount.put("word", 1);

		actualWordCount = wordCount.getNumberOfWords("word");
		assertEquals(expectedWordCount, actualWordCount);
	}

	@Test
	public void countOneOfEach() {
		Map<String, Integer> actualWordCount = new HashMap<>();
		final Map<String, Integer> expectedWordCount = new HashMap<>();
		expectedWordCount.put("one", 1);
		expectedWordCount.put("of", 1);
		expectedWordCount.put("each", 1);

		actualWordCount = wordCount.getNumberOfWords("one of each");
		assertEquals(expectedWordCount, actualWordCount);
	}

	public void countMultipleOccurrences() {
		Map<String, Integer> actualWordCount = new HashMap<>();
		final Map<String, Integer> expectedWordCount = new HashMap<>();
		expectedWordCount.put("one", 1);
		expectedWordCount.put("fish", 4);
		expectedWordCount.put("two", 1);
		expectedWordCount.put("red", 1);
		expectedWordCount.put("blue", 1);

		actualWordCount = wordCount.getNumberOfWords("one fish two fish red fish blue fish");
		assertEquals(expectedWordCount, actualWordCount);
	}

	@Test
	public void ignorePunctuation() {
		Map<String, Integer> actualWordCount = new HashMap<>();
		final Map<String, Integer> expectedWordCount = new HashMap<>();
		expectedWordCount.put("car", 1);
		expectedWordCount.put("carpet", 1);
		expectedWordCount.put("as", 1);
		expectedWordCount.put("java", 1);
		expectedWordCount.put("javascript", 1);
		
		actualWordCount = wordCount.getNumberOfWords("car: carpet as java: javascript!!&@$%^&");
		assertEquals(expectedWordCount, actualWordCount);
	}
	
	@Test
	public void includeNumbers() {
		Map<String, Integer> actualWordCount = new HashMap<>();
		final Map<String, Integer> expectedWordCount = new HashMap<>();
		expectedWordCount.put("testing", 2);
		expectedWordCount.put("1", 1);
		expectedWordCount.put("2", 1);
		
		actualWordCount = wordCount.getNumberOfWords("testing, 1, 2 testing");
		assertEquals(expectedWordCount, actualWordCount);
	}
	
	@Test
	public void normalizeCase() {
		Map<String, Integer> actualWordCount = new HashMap<>();
		final Map<String, Integer> expectedWordCount = new HashMap<>();
		expectedWordCount.put("go", 3);
		
		actualWordCount = wordCount.getNumberOfWords("go Go GO");
		assertEquals(expectedWordCount, actualWordCount);
	}

}
