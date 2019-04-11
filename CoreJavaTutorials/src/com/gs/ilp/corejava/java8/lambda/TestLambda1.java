package com.gs.ilp.corejava.java8.lambda;

interface drawable {
	void draw();
}

public class TestLambda1 {
	public static void main(String[] args) {

		drawable drawble = new drawable() {

			@Override
			public void draw() {
				System.out.println("Hello world");
			}
		};

		drawable drLambda = () -> {
			System.out.println("Hello, lambda");
		};
		
		drawble.draw();
		
		drLambda.draw();
		
	}

}
