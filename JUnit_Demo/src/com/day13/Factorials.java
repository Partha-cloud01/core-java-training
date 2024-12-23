package com.day13;

public class Factorials {

	public int getFactorial(int n)
	{
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact*=i;
		}
		return fact;
	}

}
