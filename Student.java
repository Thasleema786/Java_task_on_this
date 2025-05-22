package com.thisconstructors;

public class Student {
	int rollNumber;
	String name;
	public Student(int rollNumber,String name) {
		this.rollNumber=rollNumber;
		this.name=name;
	}
	public void updateDetails(String name) {
		System.out.println("Old Name is:"+this.name);
		this.name=name;
		System.out.println("New Name is:"+name);
	}
    public void display() {
    	System.out.println("Student Name is:"+this.name);
    	System.out.println("Student Roll Number is:"+this.rollNumber);
    }
	public static void main(String[] args) {
		 Student student=new Student(82,"Bujji");
		 student.updateDetails("Riha");
		 student.display();
	}

}
