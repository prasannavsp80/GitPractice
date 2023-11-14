package com.java.fin;

public class AbsEx1 {

	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new Riya(), new Abdul(), new Kaustubh()
		};
		
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}
