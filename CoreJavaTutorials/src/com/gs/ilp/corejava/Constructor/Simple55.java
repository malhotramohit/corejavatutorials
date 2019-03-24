package com.gs.ilp.corejava.Constructor;

public class Simple55 {
	int stdId;

	Simple55() {
		System.out.println("Running Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		Simple55 s5 = new Simple55();
		System.out.println("Value of stdId is :" + s5.stdId);
		System.out.println("--------------------");
		Simple55 s55 = new Simple55();
		System.out.println("Value of stdId is :" + s55.stdId);
		System.out.println("Main Ends");
	}
}
