package com.gs.ilp.corejava.collectionsFramework2.equalsandhashcode;

public class Doctor {
	private String fName;
	private String lName;

	/**
	 * @param fName
	 * @param lName
	 */
	public Doctor(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}

	@Override
	public int hashCode() {
		int result = fName.hashCode() + lName.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		return true;
	}

}
