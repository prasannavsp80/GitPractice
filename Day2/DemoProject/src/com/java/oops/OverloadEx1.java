package com.java.oops;

public class OverloadEx1 {
	
	public void show(int x) {
		System.out.println("Show Method w.r.t. Integer  " +x);
	}
	
	public void show(double x) {
		System.out.println("Show Method w.r.t. Double  " +x);
	}
	
	public void show(float x) {
		System.out.println("Show Method w.r.t. Float  " +x);
	}
	
	public static void main(String[] args) {
		OverloadEx1 obj = new OverloadEx1();
		obj.show(12);
		obj.show(12.4F);
		obj.show(12.5);
	}
}
