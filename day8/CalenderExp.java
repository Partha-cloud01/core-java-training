package com.day8;

import java.util.Calendar;
public class CalenderExp {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // getInstance() we are getting object(singleton class).
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.YEAR));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));

	}

}
