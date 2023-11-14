package com.java.oops;

public class ConEx1 {

	int a, b;
	
	ConEx1() {
		this.a = 5;
		this.b = 7;
	}
	
	ConEx1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void show() {
		System.out.println("A value is  " +a+ "  B value is  " +b);
	}
	
	public static void main(String[] args) {
		ConEx1 obj1 = new ConEx1();
		obj1.show();
		
		ConEx1 obj2 = new ConEx1(15, 23);
		obj2.show();
	}
}
