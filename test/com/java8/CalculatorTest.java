package com.java8;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void shouldSumTwoValuesUsingAnAnonymousClass() throws Exception {
		ICalculator<Integer> calculador = new ICalculator<Integer>() {
			
			@Override
			public Integer calculate(Integer value1, Integer value2) {
				return value1 + value2;
			}
		};
		
		Integer sum = calculador.calculate(10, 5);
		
		assertEquals(15, sum, 0);
	}
	
	@Test
	public void shouldSumTwoValuesUsingLambdaExpression() throws Exception {
		ICalculator<Integer> calculator = (v1, v2) -> v1 + v2;
		
		Integer sum = calculator.calculate(10, 5);
		
		assertEquals(15, sum, 0);
	}
	
	@Test
	public void shouldSubtractTwoValuesUsingLambdaExpression() throws Exception {
		ICalculator<Integer> calculator = (v1, v2) -> v1 - v2;
		
		Integer sub = calculator.calculate(10, 5);
		
		assertEquals(5, sub, 0);
	}
	
}
