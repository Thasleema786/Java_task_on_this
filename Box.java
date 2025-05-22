package com.thisconstructors;

public class Box {
        int length;
        public Box(int length) {
        	this.length=length;
        }
        public Box setLength(int length) {
        	this.length=length;
        	return this;
        }
        public void display() {
        	System.out.println("Legth is:"+this.length);
        }
        
	public static void main(String[] args) {
		Box box=new Box(10);
		box.setLength(10).display();
		System.out.println("....After Update...");
		Box box1=new Box(12);
		box1.setLength(12).display();

	}

}
