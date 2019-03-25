package com.gs.ilp.corejava.collectionsFramework2.equalsandhashcode;

public class BadSubClass extends BaseClass{
	private int field1 = 0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + field1;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof BadSubClass))
			return false;
		BadSubClass other = (BadSubClass) obj;
		if (field1 != other.field1)
			return false;
		return true;
	}

	
}
