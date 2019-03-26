package com.gs.ilp.corejava.finalKeyword;

public class F {
	public static void main(String[] args) {
		final int[] a = new int[5];
		a[0] = 10;
		a[0] = 20;
		System.out.println(a[0]); // 20
	}
}