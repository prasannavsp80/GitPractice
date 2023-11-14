package com.java.day2;

public class Quiz9 {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {4,5,6};
		a = b;
		b[1] =  9;
		//a[1]=10;
		System.out.println(a[1] + ""  + b[1]);
	}
}
