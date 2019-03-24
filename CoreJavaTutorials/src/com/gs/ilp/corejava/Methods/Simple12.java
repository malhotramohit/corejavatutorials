package com.gs.ilp.corejava.Methods;

public class Simple12 {
	static boolean trouble(boolean a, boolean b) {
		if (a == true && b == true) {
			return true;
		} else if (a == false && b == false) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Result is:" + Simple12.trouble(true, true));
		System.out.println("Result is:" + Simple12.trouble(false, false));
		System.out.println("Result is:" + Simple12.trouble(true, false));
		System.out.println("Result is:" + Simple12.trouble(false, true));
	}
}