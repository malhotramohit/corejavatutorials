package com.gs.ilp.corejava.collectionsFramework2.equalsandhashcode;

public class Money {
	int amount;
	String currencyCode;
	
	

	public Money() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Money(int amount, String currencyCode) {
		super();
		this.amount = amount;
		this.currencyCode = currencyCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		if (currencyCode == null) {
			if (other.currencyCode != null)
				return false;
		} else if (!currencyCode.equals(other.currencyCode))
			return false;
		return true;
	}

}
