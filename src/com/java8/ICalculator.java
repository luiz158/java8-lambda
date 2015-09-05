package com.java8;

@FunctionalInterface
public interface ICalculator<T> {

	T calculate(T t1, T t2);
	
}
