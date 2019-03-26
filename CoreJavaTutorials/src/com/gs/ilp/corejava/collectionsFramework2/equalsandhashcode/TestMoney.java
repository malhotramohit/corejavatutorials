package com.gs.ilp.corejava.collectionsFramework2.equalsandhashcode;

public class TestMoney {
	public static void main(String[] args) {
		Money income = new Money(55, "USD");
		Money expenses = new Money(55, "USD");

		System.out.println(income.hashCode());
		System.out.println(expenses.hashCode());

		System.out.println("Are the equal " + income.equals(expenses));
		System.out.println("Are the equal " + expenses.equals(income));


	}
}
