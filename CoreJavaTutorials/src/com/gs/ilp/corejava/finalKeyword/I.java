package com.gs.ilp.corejava.finalKeyword;

final class J {
	int i = 10;
}

final class I extends J // the type I cannot sub class to final
{
	public static void main(String[] args) {
		J j1 = new J();
		System.out.println(j1.i);
	}
}