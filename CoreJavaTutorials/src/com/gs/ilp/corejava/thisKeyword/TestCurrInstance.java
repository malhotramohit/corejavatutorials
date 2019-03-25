package com.gs.ilp.corejava.thisKeyword;

public class TestCurrInstance {
	int a;
	int b;

	// Default constructor
	TestCurrInstance() {
		a = 10;
		b = 20;
	}

	// Method that returns current class instance
	TestCurrInstance get() {
		return this;
	}

	// Displaying value of variables a and b
	void display() {
		System.out.println("a = " + a + "  b = " + b);
	}

	public static void main(String[] args) {
		TestCurrInstance object = new TestCurrInstance();
		object.get().display();
	}
}