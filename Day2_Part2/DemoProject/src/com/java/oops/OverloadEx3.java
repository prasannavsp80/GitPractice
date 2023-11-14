package com.java.oops;

public class OverloadEx3 {

	public int sum() {
		return 5;
	}
	
	public int sum(int x) {
		return x+5;
	}
	
	public int sum(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		OverloadEx3 obj = new OverloadEx3();
		System.out.println("Sum w.r.t. Zero Args " +obj.sum());
		System.out.println("Sum w.r.t. One Arg  " +obj.sum(15));
		System.out.println("Sum w.r.t. Two Args  " +obj.sum(42, 13));
	}
}
