package com.java.day2;

public abstract class Employ {

	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
	public void show() {
		System.out.println("Empno " +empno);
		System.out.println("Name  " +name);
		System.out.println("Basic  " +basic);
	} 
}
