package com.java.oops;

public class OverloadEx2 {

	public void show(char ch) {
		System.out.println("Welcome  " +ch);
	}
	
	public void show(String str) {
		System.out.println("Hello  " +str);
	}
	
	public void show(boolean flag) {
		System.out.println("Test  " +flag);
	}
	
	public static void main(String[] args) {
		OverloadEx2 obj = new OverloadEx2();
		obj.show("true");
		obj.show(true);
		obj.show('t');
	}
}
