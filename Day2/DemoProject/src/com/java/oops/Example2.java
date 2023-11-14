package com.java.oops;

public class Example2 {

	int i;
	public static void main(String[] args) {
		Example2 obj1 = new Example2();
		obj1.i = 12;
		Example2 obj2 = obj1;
		obj2.i = 13;
		System.out.println(obj1.i);
	}
}
