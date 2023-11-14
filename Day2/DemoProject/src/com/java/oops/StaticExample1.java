package com.java.oops;

public class StaticExample1 {

	static int count;
	
	public void show() {
		count++;
		System.out.println("Count is  " +count);
	}
	
	public static void main(String[] args) {
		StaticExample1 obj1 = new StaticExample1();
		StaticExample1 obj2 = new StaticExample1();
		StaticExample1 obj3 = new StaticExample1();
		
		obj1.show();
		obj2.show();
		obj3.show();
	}
}
