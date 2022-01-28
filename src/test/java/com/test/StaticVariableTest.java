package com.test;

public class StaticVariableTest {	
	
	private static int a = 10;
	private static int b;
	
	public static void main(String[] args) {
		
		a=12;
		b=5;
		
		System.out.println("inside method a: " + a);
		System.out.println("inside method b: " + b);
		
		setA(55);
		
		int c = getA();
		System.out.println("c: " + c);
		
		System.out.println("now a is: " + a);
		System.out.println("StaticVariableTest.a: " + StaticVariableTest.a);
		
	}

	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		StaticVariableTest.a = a;
	}

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		StaticVariableTest.b = b;
	}	
	
}
