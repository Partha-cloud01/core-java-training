package com.day5;
interface One1
{
	int a = 10;  //public, static, final
}
interface Two1
{
	int a = 20; //public, static, final
}
interface Three1 extends One1, Two1
{
	void sum();
}
class Normal_Class implements Three1
{

	@Override
	public void sum() {
		System.out.println("Sum of the two no =" + (One1.a+Two1.a));
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
	Three1 no = new Normal_Class();
	no.sum();

	}

}
