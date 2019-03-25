package com.gs.ilp.corejava.thisKeyword;

public class TestThisWithMethod {
	public static void main(String[] args) {
		TestThisWithMethod obj = new TestThisWithMethod();
		obj.methodTwo();
	}

	void methodOne() {
		System.out.println("Inside Method ONE");
	}

	void methodTwo() {
		System.out.println("Inside Method TWO");
		this.methodOne();// same as calling methodOne()
	}
}