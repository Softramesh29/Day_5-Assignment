package com.bridgelabz.Day5;

public class SwabNumber {
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 =10;
		int swab = 0;
		
		System.out.println("Before swab : " +num1 +" "+ +num2);
		
		swab = num1;
		num1 = num2;
		num2 = swab;
		
		System.out.println("After swab : " +num1 +" "+ +num2);
		
	}
}
