package com.homework.st;

public class Lenovo implements Computer,Computer.Processer {

	@Override
	public void Laptop() {
		System.out.println("The laptop is more cost than Desktop Computers");
		System.out.println("The laptop is easy to carry");
	}

	@Override
	public void Desktop() {
		// TODO Auto-generated method stub
		System.out.println("The Desktop computers is combination of keyboard,mouse etc..");
		System.out.println("The Desktop is less cost compare to desktops");
	}

	@Override
	public void i2() {
		// TODO Auto-generated method stub
		System.out.println("This is i2 processer");
	}

	@Override
	public void i4() {
		// TODO Auto-generated method stub
		System.out.println("This is i4 processor");
		
	}

public static void main(String args[]) {
	Lenovo lenovo=new Lenovo();
	lenovo.Laptop();
	lenovo.Desktop();
	lenovo.i2();
	lenovo.i4();
}
}