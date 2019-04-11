package com.gs.ilp.corejava.collectionsFramework2.equalsandhashcode;

public class Employeeee {
	private String fname;
	private String lname;

	/**
	 * @param fname
	 * @param lname
	 */
	public Employeeee(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employeeee [fname=" + fname + ", lname=" + lname + "]";
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employeeee other = (Employeeee) obj;
		if (fname == null) {
			if (other.fname != null) {
				return false;
			}
		} else if (!fname.equals(other.fname)) {
			return false;
		}
		if (lname == null) {
			if (other.lname != null) {
				return false;
			}
		} else if (!lname.equals(other.lname)) {
			return false;
		}
		return true;
	}

	
	
}
