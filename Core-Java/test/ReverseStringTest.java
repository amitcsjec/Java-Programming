package com.hcl.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//import org.junit.platform.commons.util.StringUtils;
import org.junit.platform.commons.util.StringUtils;

import com.hcl.assessment.ReverseString;

class ReverseStringTest {

	@Test
	public void whenReverseIsCalled_ThenCorrectStringIsReturned() {
		String reversed = ReverseString.reverseString("cat");
		String reversedNull = ReverseString.reverseString(null);
		String reversedEmpty = ReverseString.reverseString(StringUtils.nullSafeToString(reversedNull));

		assertEquals("tac", reversed);
		assertEquals(null, reversedNull);
		assertEquals(StringUtils.nullSafeToString(reversedEmpty), reversedEmpty);
	}

}
