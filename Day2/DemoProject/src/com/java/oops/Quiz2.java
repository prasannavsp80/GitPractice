package com.java.oops;

public class Quiz2 {

	int i;
	
	Quiz2(int i){
		i = i;
	}
	
	void add() {
		System.out.println(i + i);
	}
	
	public static void main(String[] args) {
		Quiz2 obj1 = new Quiz2(12);
		obj1.add();
	}
}
