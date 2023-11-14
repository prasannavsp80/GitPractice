package com.java.oops;

public class OverloadEx5 {

	public void show(double x) {
		System.out.println("Show From Double  " +x);
	}
	
	public void show(Object x) {
		System.out.println("Object   " +x);
	}
	
	public static void main(String[] args) {
		OverloadEx5 obj = new OverloadEx5();
		obj.show(12);
		obj.show(12.5F);
	}
}
