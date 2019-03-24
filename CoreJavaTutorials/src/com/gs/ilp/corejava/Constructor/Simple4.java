package com.gs.ilp.corejava.Constructor;

public class Simple4 {
	void Simple4() {
		System.out.println("Constructor ?");// Method with class name.
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		Simple4 s4 = new Simple4();
		System.out.println("Main Ends");
		System.out.println("-----------");
	}
}