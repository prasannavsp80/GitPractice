package com.java.oops;

public class OverloadEx6 {

	public void show(int x) {
		System.out.println("Int  " +x);
	}
	
	public void show(Object x) {
		System.out.println("Object  " +x);
	}
	
	public static void main(String[] args) {
		OverloadEx6 obj = new OverloadEx6();
		obj.show('A');
	}
}
