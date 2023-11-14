package com.java.fin;

public class Quiz1 {

	public static void main(String[] args) {
		int[] old = {6,5,4,3};
		int[] fresh = old;
		change(old);
		System.out.println(old[0] +"  " +fresh[2]);
	}
	
	public static void change(int[] temp) {
		temp[2]=3;
	}
}
