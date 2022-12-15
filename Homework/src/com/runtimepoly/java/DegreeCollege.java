package com.runtimepoly.java;

public class DegreeCollege implements College {
	String course1="B.Sc";
	String course2="B.Com";
	String course3="BBA";
			
	// Here we are implementing the interface(College) then we can overload the interface methods in the implemented class ie DegreeCollege(class)
	@Override
	public String name() {
		return "SatyaSaiDegreeCollege";//It achieves runtime polymorphism
	}

	@Override
	public void course() {
		System.out.println("The Degree college courses as follows");
		System.out.println("The Science students can do"+  course1);
		System.out.println("The Computer students can do"+  course2);
		System.out.println("The commerece students can do"+ course3);
	}
	public static void main(String args[]) {
		DegreeCollege college=new DegreeCollege();
		System.out.println(college.name());
		college.course();
	}
}