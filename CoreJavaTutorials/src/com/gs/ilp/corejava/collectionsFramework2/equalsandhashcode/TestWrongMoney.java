package com.gs.ilp.corejava.collectionsFramework2.equalsandhashcode;

public class TestWrongMoney {
	public static void main(String[] args) {
		WrongMoney income = new WrongMoney(55, "USD");
		WrongMoney expenses = new WrongMoney(55, "USD");
		boolean balanced = income.equals(expenses);
		System.out.println("Are the equal :" + balanced);
	}

}
