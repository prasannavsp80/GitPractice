package com.java.day1;

import java.util.Scanner;

public class CaseExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Enter Your Choice  ");
		choice = sc.nextInt();
		switch(choice) {
		case 1 :
			System.out.println("Hi I am Afiya...");
			break;
		case 2 : 
			System.out.println("Hi I am Abdul...");
			break;
		case 3 : 
			System.out.println("Hi I am Hari Prasath...");
			break;
		case 4 : 
			System.out.println("Hi I am Saurabh...");
			break;
		case 5 : 
			System.out.println("Hi I am Prakash...");
			break;
		default : 
			System.out.println("Invalid Choice...");
			break;
		}
	}
}
