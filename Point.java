package com.thisconstructors;

public class Point {
	int x;
	int y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void print() {
		System.out.println(this.x);
		System.out.println(this.y);
	}

	public static void main(String[] args) {
       Point p=new Point(10,22);
       p.print();
       

	}

}
