package com.bridgelabz.Day5;

public class GreatestNumber {
	public static void main(String[] args) {
		
		int num1 = 254;
		int num2 = 564;
		int num3 = 25;
		
	if(num1 > num2 && num1 > num3)
		System.out.println("Greatest number is : " +num1);
	else if(num2 > num1 && num2 > num3)
		System.out.println("Greatest number is : " +num2);
	else
		System.out.println("Greatest number is : " +num3);
	}

}
