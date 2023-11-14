package com.java.intf;

interface Company {
	String topic = "Java Training";
	void name();
}

class Abdul implements Company {

	@Override
	public void name() {
		System.out.println("From Deloitte...");
		System.out.println(topic);
	//	topic = "J2ee";
	}
	
}
public class IntfEx2 {

}
