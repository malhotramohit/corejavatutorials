package com.gs.ilp.corejava.accessModifier;

class A {
	private A() {
	}// private constructor

	void msg() {
		System.out.println("Hello java");
	}
}

public class Simple {
	public static void main(String args[]) {
		A obj = new A();// Compile Time Error
	}
}