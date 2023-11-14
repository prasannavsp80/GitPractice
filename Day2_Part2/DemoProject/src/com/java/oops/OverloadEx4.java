package com.java.oops;

public class OverloadEx4 {

	public void show(float x) {
		System.out.println("Float " +x);
	}
	
	public void show(double x) {
		System.out.println("Double " +x);
	}
	
	public void show(Object x) {
		System.out.println("Object  " +x);
	}
	public static void main(String[] args) {
		OverloadEx4 obj = new OverloadEx4();
		obj.show(12);
	}
}
