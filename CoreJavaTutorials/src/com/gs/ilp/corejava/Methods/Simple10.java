package com.gs.ilp.corejava.Methods;

public class Simple10 {
	static boolean test(int n1, int n2) {
		if (n1 + n2 == 30 || n1 == 30 || n2 == 30) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Result is " + Simple10.test(10, 20));
		System.out.println("Result is " + Simple10.test(20, 20));
	}
}