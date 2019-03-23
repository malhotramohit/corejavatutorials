package com.gs.ilp.corejava.collectionsFramework2.equalsandhashcode;

public class TestWrongVoucher {
	public static void main(String[] args) {
		Money cash = new Money(42, "USD");
		WrongVoucher voucher = new WrongVoucher(42, "USD", "Amazon");

		System.out.println(voucher.equals(cash));
		System.out.println(cash.equals(voucher));
	}

}
