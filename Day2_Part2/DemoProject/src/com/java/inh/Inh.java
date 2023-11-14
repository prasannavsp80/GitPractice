package com.java.inh;

class C1 {
	C1() {
		System.out.println("C1 class Constructor...");
	}
}

class C2 extends C1 {
	C2() {
		System.out.println("C2 class Constructor...");
	}
}

class C3 extends C2 {
	C3() {
		System.out.println("C3 class Constructor...");
	}
}

public class Inh {
	public static void main(String[] args) {
		new C3();
	}
}
