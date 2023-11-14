package com.java.oops;

public class Example6 {

		int i;
		public void show(int i) {
			this.i = i;
		}
		public static void main(String[] args) {
			Example6 obj = new Example6();
			obj.show(12);
			System.out.println(obj.i);
		}
}
