package com.homework.st;

public class Manager extends Employee {

	@Override
	void EmployeeId(int Id) {
		System.out.println("Employee Id is:"+Id);
		
	}

	@Override
	void EmployeeSal(int basicpay, int HRA, int Otherallow) {
		int salary=basicpay+HRA+Otherallow;
		System.out.println("Employee salary: "+salary);
		
	}

	@Override
	void EmployeeName(String name) {
		System.out.println("Employee name:"+name);
		
	}
	/*Here the EmployeeSal method is already declared in parent class with three parameters of type int but again we are using the same 
	method in child class(Manager),This achieves Polymorphism ie Method Overloading*/
	public void EmployeeSal(int basicpay,int HRA,int Ot,int Otherallow) {
		int salary=basicpay+HRA+Ot+Otherallow;
		System.out.println("Employee salary:"+salary);
	}
	//The data related to employee like year of join ,experience and salary are in the same class this achieves Encapsulation.
	public void YearOfJoin(int year) {
		System.out.println("The Employee Joining year is:"+year);
	}
	public void YearsOfExperience(int year) {
		System.out.println("The Employee experience is:"+year+"years");
	}
	public static void main(String args[]) {
		Manager manager=new Manager();
		System.out.println("Employee details are as follows");
		manager.EmployeeId(1);
		manager.EmployeeName("Kiran");
		manager.EmployeeSal(18000, 2000, 5000,5000);
		manager.YearOfJoin(2018);
		manager.YearsOfExperience(5);
	}
}





