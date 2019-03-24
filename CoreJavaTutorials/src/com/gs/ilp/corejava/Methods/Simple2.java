package com.gs.ilp.corejava.Methods;

public class Simple2 {
	static void cube(int num) {
		int c = num * num * num;
		System.out.println("Result is: " + c);
	}

	public static void main(String[] args) {
		Simple2.cube(3);
	}
}