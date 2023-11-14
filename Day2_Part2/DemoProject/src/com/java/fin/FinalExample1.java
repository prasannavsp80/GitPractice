package com.java.fin;

public class FinalExample1 {

	final String company = "Deloitte";
	
	public static void main(String[] args) {
		FinalExample1 obj1 = new FinalExample1();
		System.out.println(obj1.company);
	//	obj1.company = "TCS";
		// Not possible as its final variable.
		
	}
}
