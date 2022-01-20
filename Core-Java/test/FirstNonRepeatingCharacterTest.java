package com.hcl.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.hcl.assessment.FirstNonRepeatingCharacter;

class FirstNonRepeatingCharacterTest {
	
	@Test
	public void testFirstNonRepeatingCharacter() {
		assertEquals('b', FirstNonRepeatingCharacter.firstNonRepeating("abcdefghi ja"));
		assertEquals('h', FirstNonRepeatingCharacter.firstNonRepeating("hello"));
		assertEquals('J', FirstNonRepeatingCharacter.firstNonRepeating("Java"));
		assertEquals('l', FirstNonRepeatingCharacter.firstNonRepeating("world"));
	}

}
