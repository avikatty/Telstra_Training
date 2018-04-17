package com.telstra.telstra_training.service;

import org.springframework.stereotype.Component;

@Component
public class FibonacciService {

	public int getNthFibonacciNumber(int fib) {
		int variableOne = 1;
		int variableTwo = 0;

		if (fib < 0) {
			throw new IllegalArgumentException("Wrong input: " + fib);
		}

		for (int i = 0; i <= fib; i++) {
			int FibNum = variableOne + variableTwo;
			variableOne = variableTwo;
			variableTwo = FibNum;
		}
		return variableOne;
	}

}
