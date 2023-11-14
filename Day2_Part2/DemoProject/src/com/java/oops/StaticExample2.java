package com.java.oops;

public class StaticExample2 {

	static int count;
	
	public void increment() {
		count++;
	}
	
	public void show() {
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		StaticExample2 obj1 = new StaticExample2();
		StaticExample2 obj2 = new StaticExample2();
		
		obj1.increment();
		obj2.increment();
		
		obj1.show();
		obj2.show();
	}
}
