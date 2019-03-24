package com.gs.ilp.corejava.Constructor;

public class Simple22 {
	Simple22() {
		System.out.println("Running Demo1 constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		Simple22 s2 = new Simple22();
		System.out.println("------------");
		Simple22 s22 = new Simple22();
		System.out.println("Main Ends");
	}
}
