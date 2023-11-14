package com.java.intf;

interface IOne {
	void show();
}

class Charitha implements I1 {

	@Override
	public void show() {
		System.out.println("Hi I am Charitha...");
	}
}

class Shivananda implements I1 {

	@Override
	public void show() {
		System.out.println("Hi I am Shivananda...");
	}
	
}

public class IntfEx1 {
	public static void main(String[] args) {
		I1 obj1 = new Charitha();
		I1 obj2 = new Shivananda();
		obj1.show();
		obj2.show();
	}
}
