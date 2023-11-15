package com.java.intf;

public class MultiInh implements IOne, ITwo {

	@Override
	public void email() {
		System.out.println("Email is saurabh@gmail.com");
	}

	@Override
	public void name() {
		System.out.println("Name is Saurabh...");
	}

}
