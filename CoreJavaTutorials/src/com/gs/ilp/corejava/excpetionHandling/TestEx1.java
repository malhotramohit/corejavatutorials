package com.gs.ilp.corejava.excpetionHandling;

import com.gs.ilp.corejava.objectAndClass.basics.Emp;
import com.gs.ilp.corejava.objectAndClass.basics.Employee;

public class TestEx1 {
	public static void main(String[] args) {

		int i = 3;
		// System.out.println(i/0);

		int[] r = { 1, 2 };
		int index = 2;
		if (r.length - 1 < index) {
			System.out.println("error");
		} else {
			int a = r[2];
		}

		Employee e = null;

		try {
			e.hashCode();
			//
			//
			//

		} catch (NullPointerException nex) {
			System.out.println("I have cat... + " + nex);
		} catch (ArithmeticException nex) {
			System.out.println("I have cat... + " + nex);
		}

		catch (Exception ex) {
			System.out.println("I have cat... + " + ex);
		} finally {
			System.out.println("I will alwyas run");
		}

		System.out.println("I am running");
		Test test = new Test();
		String data = null;
		try {
			data = test.getDataFromDb(1);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Ex catched -" + e1);
		}
		System.out.println(data);

	}

}
