package com.gs.ilp.corejava.thisKeyword;

public class TestWithConstructor {
	TestWithConstructor() {
		this("Test ");
		System.out.println("Inside Constructor without parameter");
	}

	TestWithConstructor(String str) {
		System.out.println("Inside Constructor with String parameter as " + str);
	}

	public static void main(String[] args) {
		TestWithConstructor obj = new TestWithConstructor();
	}
}