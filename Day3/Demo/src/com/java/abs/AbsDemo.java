package com.java.abs;

public class AbsDemo {

	public static void main(String[] args) {
//		Training t1 = new Abdul();
//		Training t2 = new Harika();
//		Training t3 = new Riya();
		
		Training[] arr = new Training[] {
			new Abdul(), new Harika(), new Riya()	
		};
		
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}
