package com.java.inh;

class A {
	A() {
		System.out.println("Class A...");
	}
}

class B extends A {
	B() {
		System.out.println("Class B...");
	}
}

public class Inhc {

	public static void main(String[] args) {
		new B();
	}
}
