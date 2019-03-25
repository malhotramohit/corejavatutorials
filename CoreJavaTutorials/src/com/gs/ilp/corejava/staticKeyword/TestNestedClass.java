package com.gs.ilp.corejava.staticKeyword;

public class TestNestedClass {
	public static void main(String args[]) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		// calling non-static method of Inner class
		inner.display();
		// we can also combine above steps in one step to create instance of
		// Inner class
		OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
		// similarly we can now call Inner class method
		innerObject.display();
		// create instance of nested Static class
		OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
		// call non static method of nested static class
		printer.printMessage();
	}
}
