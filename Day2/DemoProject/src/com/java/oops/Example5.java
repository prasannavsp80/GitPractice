package com.java.oops;

public class Example5 {

	int i;
	public void show(int i) {
		i=i;
	}
	public static void main(String[] args) {
		Example5 obj = new Example5();
		obj.show(12);
		System.out.println(obj.i);
	}
}
