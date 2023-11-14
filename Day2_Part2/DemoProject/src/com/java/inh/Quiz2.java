package com.java.inh;

public class Quiz2 {

	void compute(int a, int b)
	{
	    System.out.print(a+b);
	}
	
	void compute(float a, float b)
	{
	  System.out.print(a * b);
	}
	
    void compute(int a, float b)
	{
	    System.out.print(a / b);
	}
    
	public static void main(String[] args) {
		Quiz2 a = new Quiz2();
	    a.compute(1,2);
	    a.compute(2,2.0f);
	    a.compute((float)4,2.0f);
	}
}
