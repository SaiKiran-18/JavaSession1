package com.homework.st;

public class Vehicle {
	private int noOfWheels=4;
	private String fuel="petrol";
	private String Color="red";
	public class Car{
		void feauters() {
			
			System.out.println("Car details are:");
			System.out.println("The number of wheels of a car is:"+noOfWheels);
			System.out.println("The fuel of car is:"+fuel);
			System.out.println("The color of car is:"+Color);
		}
	}
	public class Byke{
		void feauters(String Company,int cost,String speed) {
			System.out.println("Bike details are:");
			System.out.println("The company of bike is:"+Company);
			System.out.println("The cost of the bike is:"+cost);
			System.out.println("The speed of bike is:"+speed);
		}
			
		}
	public static void main(String args[]) {
		Vehicle vehicle=new Vehicle();
		Vehicle.Car vcar=vehicle.new Car();
		Vehicle.Byke vByke=vehicle.new Byke();
		vcar.feauters();
		vByke.feauters("Hero",50000,"60kmph");
	}
}
		
	


