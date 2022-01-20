package com.hcl.junit.test;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.hcl.assessment.CommaSeparatedString;

public class CommaSeparatedStringTest {

	@Test
	public void getStringShouldOutputEvenUnevenString() {
		System.out.println("StringShouldOutputEvenUnevenString");
		String expectedResult1 = CommaSeparatedString.getString(asList(3, 44));
		assertEquals("o3,e44", expectedResult1);
		
		String expectedResult2 = CommaSeparatedString.getString(singletonList(3));
		assertEquals("o3", expectedResult2);
//		assertThat(CommaSeparatedString.getString(asList(3,44))).isEqualTo("o3,e44");
//	    assertThat(CommaSeparatedString.getString(singletonList(3))).isEqualTo("o3");

	}

	private List<Integer> singletonList(int i) {
		List<Integer> list = new ArrayList<Integer>();
		list = Arrays.asList(3);
		return list;
	}

	private List<Integer> asList(int i, int j) {
		List<Integer> list = new ArrayList<Integer>();
		list = Arrays.asList(3, 44);
		return list;
	}

}
