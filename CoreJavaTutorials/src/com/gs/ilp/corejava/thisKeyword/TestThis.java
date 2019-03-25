package com.gs.ilp.corejava.thisKeyword;

public class TestThis {
	int variable = 5;

	void method(int variable) {
		variable = 10;
		System.out.println("Value of variable :" + variable);
	}

	void method() {
		int variable = 40;
		System.out.println("Value of variable :" + variable);
	}

	public static void main(String args[]) {
		TestThis obj = new TestThis();
		obj.method(20);
		obj.method();
	}
}