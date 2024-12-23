package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.day13.Factorials;

public class FactorialsTest {

	@Test
	public void testGetFactorial() {
		Factorials facts = new Factorials();
		int actual = facts.getFactorial(5);
		int expected = 120;
		assertEquals(expected, actual);
	}

}
