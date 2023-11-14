package com.java.oops;

public class Example1 {

	public void show() {
		System.out.println("Java Training...");
	}
	
	public void company() {
		System.out.println("From Deloitte...");
	}
	
	public void timing() {
		System.out.println("From 9 to 6...");
	}
	
	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.show();
		obj.company();
		obj.timing();
	}
}
