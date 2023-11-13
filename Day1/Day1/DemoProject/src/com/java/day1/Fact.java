package com.java.day1;

import java.util.Scanner;

/**
 * Program to Display Factorial of Given No...
 * @author lenovo
 *
 */
public class Fact {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value  ");
		n = sc.nextInt();
		int f=1,i=1;
		while(i <= n) {
			f = f * i;
			i++;
		}
		System.out.println("Factorial Value is  " +f);
	}
}
