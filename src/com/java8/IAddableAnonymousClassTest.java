package com.java8;

public class IAddableAnonymousClassTest {

	public static void main(String[] args) {
		IAddable<String> stringAdder = new IAddable<String>() {
			
			@Override
			public String add(String t1, String t2) {
				return t1 + " " + t2;
			}
		};
		
		String fullString = stringAdder.add("Alexandre", "Gama");
		
		System.out.println(fullString);
	}
	
}
