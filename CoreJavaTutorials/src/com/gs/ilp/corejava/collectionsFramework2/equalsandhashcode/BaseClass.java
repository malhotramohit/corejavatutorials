package com.gs.ilp.corejava.collectionsFramework2.equalsandhashcode;

public class BaseClass {
	
	private int field = 0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + field;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof BaseClass))
			return false;
		BaseClass other = (BaseClass) obj;
		if (field != other.field)
			return false;
		return true;
	}
	
	
	
	

}
