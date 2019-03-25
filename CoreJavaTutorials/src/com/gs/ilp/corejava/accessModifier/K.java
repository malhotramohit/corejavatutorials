package com.gs.ilp.corejava.accessModifier;

class A {
	protected void msg() {
		System.out.println("Hello java");
	}
}

public class Simple extends A {
	void msg() {
		System.out.println("Hello java");
	}

	// compile time Error
	public static void main(String args[]) {
		Simple obj = new Simple();
		obj.msg();
	}
}