package com.day3;

import java.util.Scanner;

class Shapes
{
	int length;
	int breadth;
	int side;
	int height;
	public Shapes(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public Shapes(int side) {
		super();
		this.side = side;
	}
	public Shapes(int length, int breadth, int height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	void area()
	{
		System.out.println("cannot define an area for shapes");
	}
}
//
class Rectangle extends Shapes
{

	public Rectangle(int length, int breadth) {
		super(length, breadth);
	}
	void area()
	{
		System.out.println("The area of the Rectangle is:" + (length * breadth));
	}
	
}
class Square extends Shapes
{

	public Square(int side) {
		super(side);
	}
	void area()
	{
		System.out.println("The area of the Square is:" + (side * side));
	}
	
}
class Triangle extends Shapes
{

	public Triangle(int length, int breadth, int height) {
		super(length, breadth, height);
	}
	void area()
	{
		System.out.println("The area of the Triangle is:" + (length * breadth *height)/2);
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
		
		Rectangle rectangle = new Rectangle( a, b);
		rectangle.area();
		Square square = new Square(c);
		square.area();
		Triangle triangle = new Triangle(a,b,d);
		triangle.area();
		sc.close();
	}

}
