package com.gs.ilp.corejava.Methods;

public class Simple11 {
	static int twiceSum(int a, int b) {
		if (a == b) {
			return 2 * (a + b);
		} else
			return (a + b);
	}

	public static void main(String[] args) {
		System.out.println("Result is :" + Simple11.twiceSum(10, 20));
		System.out.println("Result is :" + Simple11.twiceSum(10, 20));
		System.out.println("Result is :" + Simple11.twiceSum(10, 10));
	}
}