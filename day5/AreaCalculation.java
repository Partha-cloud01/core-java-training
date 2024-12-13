package com.day5;

import java.util.Scanner;

abstract class Shapes {
	int length;
	int breadth;
	int side;
	int height;

	public Shapes(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public Shapes(int side) {
		this.side = side;
	}

	public Shapes(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	abstract void area();
}

//
class Rectangle extends Shapes {

	public Rectangle(int length, int breadth) {
		super(length, breadth);
	}

	void area() {
		System.out.println("The area of the Rectangle is:" + (length * breadth));
	}

}

class Square extends Shapes {

	public Square(int side) {
		super(side);
	}

	void area() {
		System.out.println("The area of the Square is:" + (side * side));
	}

}

class Triangle extends Shapes {

	public Triangle(int length, int breadth, int height) {
		super(length, breadth, height);
	}

	void area() {
		System.out.println("The area of the Triangle is:" + (length * breadth * height) / 2);
	}

}

public class AreaCalculation {

	public static void main(String[] args) {
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length and Breadth");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Enter the Side");
		c = sc.nextInt();
		System.out.println("Enter the Height");
		d = sc.nextInt();

		Shapes shape;

		shape = new Rectangle(a, b);
		shape.area();

		shape = new Square(c);
		shape.area();

		shape = new Triangle(a, b, d);
		shape.area();

		sc.close();
	}

}
