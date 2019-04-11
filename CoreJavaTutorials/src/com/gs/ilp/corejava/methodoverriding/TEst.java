package com.gs.ilp.corejava.methodoverriding;

public class TEst {
	public void m6(Object obj) {
		System.out.println(" my parent 1");
	}

	public void m6(Dog obj) {
		System.out.println(" my parent 2");
	}

	public static void main(String[] args) {
		TEst test = new TEst();
		test.m6(null);
	}

}
