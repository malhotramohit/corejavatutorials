package com.gs.ilp.corejava.excpetionHandling;

public class Test {
	public String getDataFromDb(int i) throws Exception {
		if (i == 1) {
			throw new NullPointerException();
		}
		return "Something";
	}

}
