package com.java.oops;

public class ConEx {

	static {
		System.out.println("Static Block...");
	}
	
	ConEx() {
		System.out.println("Constructor Block...");
	}
	
	public static void main(String[] args) {
		ConEx obj = new ConEx();
	}
}
