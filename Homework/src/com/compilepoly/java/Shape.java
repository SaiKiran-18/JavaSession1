package com.compilepoly.java;

public class Shape{
	double pi=3.414;
	public void area(int length,int breadth) {
		System.out.println("The area of rectangle is:"+length*breadth);
	}
	public void area(int radi) {
		System.out.println("The area of circle is:"+pi*radi*radi);
	}
	public void area(int length,int breadth,int height) {
		System.out.println("The volume of the cube is:"+length*breadth*height);
	}
	public static void main(String args[]) {
		Shape shape=new Shape();
		shape.area(10,20);// The method name is area but the arguments or parameters which we are passing is different hence it is known as 
		shape.area(5);    // method overloading or compiletime polymorphism
		shape.area(1,2,3);
	}
}