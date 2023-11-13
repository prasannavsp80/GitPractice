package com.java.day1;

public class ArrayExample1 {
	public static void main(String[] args) {
		int[] a = new int[] {4,21,66,33,93};
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		for (int i : a) {
			System.out.println("I value  " +i);
		}
	}
}
