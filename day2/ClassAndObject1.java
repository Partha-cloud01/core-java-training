package com.day2;

class Mobile {
	int regNo;
	String brandName;
	double price;

	// constructor
	Mobile(int reg, String name, double mobPrice) {
		this.regNo = reg;
		this.brandName = name;
		this.price = mobPrice;
	}

	// display method
	void diplay() {
		System.out.println("Registration No.:" + regNo);
		System.out.println("Brand Name :" + brandName);
		System.out.println("Price of the mobile :" + price);
		System.out.println();
	}
}

public class ClassAndObject1 {

	public static void main(String[] args) {
		Mobile m = new Mobile(1001, "iPhone", 78000);
		m.diplay();
		Mobile m1 = new Mobile(1002, "Realme", 18000);
		m1.diplay();
	}

}
