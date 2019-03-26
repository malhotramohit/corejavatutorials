package com.gs.ilp.corejava.finalKeyword;

public class B {
	final int j;// error because not initialized

	public static void main(String[] args) {
		final int j;// local variables should be initialized before usage System.out.println(j);
	}
}