package com.gs.ilp.corejava.java8.lambda;

interface Windows {
	int checkWindows(int a, int b);
}

public class TestLamdaParam {
	public static void main(String[] args) {
		Windows windows = (a, b) -> (a * b);

		int res = windows.checkWindows(10, 30);
		System.out.println(res);

	}

}
