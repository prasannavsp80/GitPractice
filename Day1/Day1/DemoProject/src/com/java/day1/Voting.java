package com.java.day1;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age  ");
		age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You are Elligible for Voting...");
		} else {
			System.out.println("You Cannot Vote...");
		}
	}
}
