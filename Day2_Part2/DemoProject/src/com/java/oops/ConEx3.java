package com.java.oops;

public class ConEx3 {

	int sid;
	String sname;
	double cgpa;
	
	ConEx3() {
		this.sid = 1;
		this.sname = "Gunashelan";
		this.cgpa = 9.8;
	}
	
	ConEx3(int sid, String sname, double cgpa) {
		this.sid = sid;
		this.sname = sname;
		this.cgpa = cgpa;
	}
	
	public void show() {
		System.out.println("Sid  " +sid);
		System.out.println("Student Name  " +sname);
		System.out.println("Cgpa  " +cgpa);
	}
	
	public static void main(String[] args) {
		ConEx3 obj1 = new ConEx3();
		obj1.show();
		ConEx3 obj2 = new ConEx3(3, "Jeevitha", 88424);
		obj2.show();
	}
	
}
