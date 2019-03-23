package com.gs.ilp.corejava.collectionsFramework2.equalsandhashcode;

public class WrongVoucher extends Money {

	private String store;

	public WrongVoucher(String store) {
		super();
		this.store = store;
	}

	public WrongVoucher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WrongVoucher(int amount, String currencyCode, String store) {
		super(amount, currencyCode);
		this.store = store;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof WrongVoucher))
			return false;
		WrongVoucher other = (WrongVoucher) o;
		boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
				|| (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
		boolean storeEquals = (this.store == null && other.store == null)
				|| (this.store != null && this.store.equals(other.store));
		return this.amount == other.amount && currencyCodeEquals && storeEquals;
	}

}
