package com.gs.ilp.corejava.finalKeyword;

class L {
	int i = 20;
}

final class K extends L {
	public static void main(String[] args) {
		L l1 = new L();
		System.out.println(l1.i);
	}
}
