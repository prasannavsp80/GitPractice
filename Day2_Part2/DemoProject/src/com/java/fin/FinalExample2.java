package com.java.fin;

class First {
	public final void show() {
		System.out.println("Show From First...");
	}
}

class Second extends First {
	
//	public void show() {
//		System.out.println("Show From Second...");
//	}
}

// Above code throws compiled time error as final
//method cannot be redefined in derived class
public class FinalExample2 {

}
