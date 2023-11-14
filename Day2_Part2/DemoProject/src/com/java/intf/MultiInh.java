package com.java.intf;

public class MultiInh implements I1, I2{

	@Override
	public void display() {
		System.out.println("From Display method...");
	}

	@Override
	public void show() {
		System.out.println("From Show Method...");
	}

	public static void main(String[] args) {
		MultiInh obj = new MultiInh();
		obj.show();
		obj.display();
	}
}
