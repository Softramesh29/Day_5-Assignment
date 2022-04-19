package com.bridgelabz.Day5;

import java.util.Scanner;

public class Fuctional_WindChill {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.println("Enter the Temperature in Fahrenheit : ");
		double temp = input.nextDouble();
			System.out.println("Enter the Wind Speed in Miles per Hour : ");
		double windSpeed = input.nextDouble();
		double windChill = 35.75 + (0.6215 * temp) + (((0.4275 * temp) - 35.75) *Math.pow(windSpeed , 0.16));
		System.out.println("Wind Chill is : "+windChill);
				
	}
}
