package com.day12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAPIExp {
	//to overcome the date in utility class developed separate API
	public static void main(String[] args) {
		//now is a static method
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dateTime =LocalDateTime.now();
		System.out.println(dateTime);

	}

}
