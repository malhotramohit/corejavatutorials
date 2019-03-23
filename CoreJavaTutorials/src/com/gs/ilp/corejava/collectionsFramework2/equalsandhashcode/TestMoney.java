package com.gs.ilp.corejava.collectionsFramework2.equalsandhashcode;

public class TestMoney {
	public static void main(String[] args) {
		Money income = new Money(55, "USD");
		Money expenses = new Money(55, "USD");
		boolean balanced = income.equals(expenses);
		System.out.println("Are the equal :"+balanced);
	}
}
