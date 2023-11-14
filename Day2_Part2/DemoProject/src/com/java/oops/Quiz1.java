package com.java.oops;

public class Quiz1 {

	int i;
	
	Quiz1(int i){
		this.i = i;
	}
	
	void add() {
		System.out.println(i + i);
	}
	
	public static void main(String[] args) {
		Quiz1 obj1 = new Quiz1(12);
		obj1.add();
	}
}
