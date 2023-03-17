package com.qa.demo;

public class Factorial {
	public String calcFactorial(double num) {
		String result =null;
		double num1=1;
		while (num>1) {
			num1++;
			num=num/num1;
		}
		if (num==1) {
			result = (int)num1+"!";
		}
		else
			result = "NONE";
		return result;
	}
}
