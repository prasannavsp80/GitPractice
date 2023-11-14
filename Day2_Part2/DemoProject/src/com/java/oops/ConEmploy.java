package com.java.oops;

class Employ {
	
	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	public Employ() {

	}

	public void show() {
		System.out.println("Employ No  " +empno+ " Name  " +name+ " Basic " +basic);
	}
}

public class ConEmploy {
	public static void main(String[] args) {
		Employ e1 = new Employ(12, "Rajesh", 56622);
		e1.show();
		Employ e2 = new Employ(13, "Jeevitha", 89644);
		e2.show();
	}
}
