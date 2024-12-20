package com.day11;

import java.util.Optional;

public class OptionalClassExp {

	public static void main(String[] args) {
		String name = "Partha";
		Optional<String> nameOptional = Optional.ofNullable(name);
		
		if(nameOptional.isPresent()) {
			//value is present ,you can access it using get()
			String value = nameOptional.get();
			System.out.println("Value is present" +" :"+ value);
		}
		else {
			//value is absent
			System.out.println("Value is absent !!");
		}

	}

}
