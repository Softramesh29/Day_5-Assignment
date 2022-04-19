package com.bridgelabz.Day5;

import java.util.Scanner;

public class Functional_Distance {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
				System.out.println("Enter X value : ");
			int x = s.nextInt();
				System.out.println("Enter Y value : ");
			int y = s.nextInt();
				System.out.println("Distance is " + (Math.pow((x * x + y * y), 0.5)));
	}
}
