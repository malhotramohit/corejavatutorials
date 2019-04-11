package com.gs.ilp.corejava.java8.lambda;

public class Flight {
	
	private int id;
	private String name;
	
	
	
	/**
	 * @param name
	 */
	public Flight(String name) {
		this.name = name;
	}
	/**
	 * @param id
	 * @param name
	 */
	public Flight(int id, String name) {
		this.id = id;
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + "]";
	}
	

}
