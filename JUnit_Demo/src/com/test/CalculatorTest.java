package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Ignore;

import com.day13.Calculator;

import org.junit.Test;

public class CalculatorTest {
	int input1;
	int input2;
	static Calculator calc;
	@BeforeClass // it will executed before the class
	public static void beforeClass()
	{
		System.out.println("before Class");
		calc = new Calculator();
		System.out.println("object is created");
	}
	
	@AfterClass //it will executed after the object is cleared.
	public static void afterClass()
	{
		System.out.println("after Class");
		calc = null;
	}
	@Before
	public void before() {
		//before is pre logic eg file opening
		System.out.println("Before");
		input1 = 10;
		input2 = 20;
		//System.out.println(input1 + input2);
	}
	
	@After
	public void after()
	{
		System.out.println("After");
		input1 = 0;
		input2 = 0;
		System.out.println(input1);
		System.out.println(input2);
		
	}

	@Test
	public void testAddition() {
		System.out.println("Testcase1 Addition");
		//Calculator calc = new Calculator();
		int actual = calc.addition(10, 20);
		int expected = 30;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtraction() {
		System.out.println("Testcase2 Substraction");
		//Calculator calc = new Calculator();
		int actual = calc.subtraction(30, 20);
		int expected = 10;
		assertEquals(expected, actual);
	}

}
