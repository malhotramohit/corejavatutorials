package com.gs.ilp.corejava.collectionsFramework2.equalsandhashcode;

public class TestEqualsSymIssue {
	public static void main(String[] args) {
		BaseClass baseClass = new BaseClass();
		BadSubClass subClass = new BadSubClass();

		System.out.println(baseClass.equals(subClass)); // prints 'true'
		System.out.println(subClass.equals(baseClass)); // prints 'false'
	}
}
