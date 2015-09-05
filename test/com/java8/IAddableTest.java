package com.java8;

import static org.junit.Assert.*;

import org.junit.Test;

public class IAddableTest {

	@Test
	public void shouldAddSomeStringUsingAnonymousClass() throws Exception {
		IAddable<String> stringAdder = new IAddable<String>() {
			
			@Override
			public String add(String t1, String t2) {
				return t1 + " " + t2;
			}
		};
		
		String fullName = stringAdder.add("Alexandre", "Gama");
		
		assertEquals("Alexandre Gama", fullName);
	}
	
}
