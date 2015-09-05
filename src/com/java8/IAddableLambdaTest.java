package com.java8;

public class IAddableLambdaTest {

	public static void main(String[] args) {
		IAddable<String> stringAdder = (String s1, String s2) -> s1 + " " + s2;
		
		String fullString = stringAdder.add("Aexandre", "Gama");
		
		System.out.println(fullString);
	}
	
}
