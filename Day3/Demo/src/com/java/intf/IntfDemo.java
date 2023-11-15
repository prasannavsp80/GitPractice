package com.java.intf;

public class IntfDemo {

	public static void main(String[] args) {
//		ITraining obj1 = new Prakash();
//		ITraining obj2 = new Shivananda();
		
		ITraining[] arr = new ITraining[] {
			new Prakash(), new Shivananda()	
		};
		
		for (ITraining i : arr) {
			i.name();
			i.email();
		}
	}
}
