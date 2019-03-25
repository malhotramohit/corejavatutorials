package com.gs.ilp.corejava.thisKeyword;

public class TestWithThis {
	int variable = 5;

	public static void main(String args[]) {
		TestWithThis obj = new TestWithThis();
		obj.method(20);
		obj.method();
	}

	void method(int variable) {
		variable = 10;
		System.out.println("Value of Instance variable :" + this.variable);
		System.out.println("Value of Local variable :" + variable);
	}

	void method() {
		int variable = 40;
		System.out.println("Value of Instance variable :" + this.variable);
		System.out.println("Value of Local variable :" + variable);
	}
}