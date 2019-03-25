package com.gs.ilp.corejava.staticKeyword;

//Program to get cube of a given number by static method  
public class Calculate {
	static int cube(int x) {
		return x * x * x;
	}

	public static void main(String args[]) {
		int result = Calculate.cube(5);
		System.out.println(result);
	}
}