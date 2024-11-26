package com;

public class GFG {
	    int fact(int n) {
	        if (n <= 0) {
	            throw new IllegalArgumentException("Factorial is not defined for negative numbers or zero.");
	        }
	        if (n == 1) {
	            return 1;
	        }
	        return n * fact(n - 1); // Recursive call to calculate factorial
	    }

}
