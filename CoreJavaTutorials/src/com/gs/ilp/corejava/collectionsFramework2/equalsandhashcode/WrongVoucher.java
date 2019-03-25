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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof WrongVoucher))
			return false;
		WrongVoucher other = (WrongVoucher) obj;
		if (store == null) {
			if (other.store != null)
				return false;
		} else if (!store.equals(other.store))
			return false;
		return true;
	}


}
