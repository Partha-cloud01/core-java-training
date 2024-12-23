package com.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



//combine all test cases together

@RunWith(Suite.class)
@SuiteClasses({
	CalculatorTest.class,
	CalculatorTest1.class,
	FactorialsTest.class
})
public class MyTestSuite {

}
