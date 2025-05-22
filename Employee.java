package com.thisconstructors;

public class Employee {
	String name;
	double salary;
	public Employee(String name,double salary) {
		this.name=name;
		this.salary=salary;
	}
     public void setSalary(String name,double salary) {
    	 this.name=name;
    	 this.salary=salary;
     }
     public void display() {
    	 System.out.println("Employee Name is:"+name);
    	 System.out.println("Employee Salary is:"+salary);
     }
	public static void main(String[] args) {
		Employee emp=new Employee("Riha",50000);
		emp.display();
		System.out.println(".....After updation.......");
		Employee emp1=new Employee("Ajju",70000);
		emp1.display();

	}

}
