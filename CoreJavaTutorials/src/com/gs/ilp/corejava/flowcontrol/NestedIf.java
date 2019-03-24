package com.gs.ilp.corejava.flowcontrol;

public class NestedIf {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int k = 0;
		if (i == 10) {
			if (j < 20)
				a = b;
			if (k > 100)
				c = d; // this if is
			else
				a = c; // associated with this else
		} else
			a = d; // this else refers to if(i == 10)
	}
}
