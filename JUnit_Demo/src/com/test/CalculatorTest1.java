package com.test;

import com.day13.Calculator;
//parameterized test case
import static org.junit.Assert.*;

//import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Ignore;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTest1 {
	static Calculator calc;
	private int input1;
	private int input2;
	private int expected1;
	private int expected2;

	public CalculatorTest1(int input1, int input2, int expected1, int expected2) {
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.expected1 = expected1;
		this.expected2 = expected2;
	}

	@BeforeClass // it will executed before the class
	public static void beforeClass() {
		// System.out.println("before Class");
		calc = new Calculator();
		System.out.println("object is created");
	}

	@AfterClass // it will executed after the object is cleared.
	public static void afterClass() {
		System.out.println("after Class");
		calc = null;
	}

	@Before
	public void before() {
		// before is pre logic eg file opening
		System.out.println("Before");

		// System.out.println(input1 + input2);
	}

	@After
	public void after() {
		System.out.println("After");
		input1 = 0;
		input2 = 0;

	}

	@Test
	public void testAddition() {
		int actual = calc.addition(input1, input2);
		assertEquals(expected1, actual);
	}

	@Test
	public void testSubtraction() {
		int actual = calc.subtraction(input1, input2);
		assertEquals(expected2, actual);
	}

	@Parameters
	public static Collection calculatorNumber()
	{
		return Arrays.asList(new Object[][]{
		{2, 4, 6, -2},
		{4, 2, 6, 2},
		{7, 8, 15, -1},
		{6, 7, 13, -1}});
	}

}
