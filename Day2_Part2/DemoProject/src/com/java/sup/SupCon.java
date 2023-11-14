package com.java.sup;

class Employ {
	
	int empno;
	String name;
	double basic;
	
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
	public void show() {
		System.out.println("Employ No  " +empno);
		System.out.println("Employ Name  " +name);
		System.out.println("Basic  " +basic);
	}
}

class Abdul extends Employ {

	public Abdul(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

public class SupCon {
	public static void main(String[] args) {
		Employ obj = new Abdul(1, "Abdul", 88234);
		obj.show();
	}
}
