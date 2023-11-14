package com.java.inh;

class A1 {
	int i;

	A1() {
		i = 10;
	}
}

class B1 extends A1 {
	int i;

	B1() {
		i = 20;
	}

	void add() {
		System.out.println(i + i);
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		new B1().add();
	}
}
