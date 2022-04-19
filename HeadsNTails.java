package com.bridgelabz.Day5;

import java.util.Random;
import java.lang.*;
import java.util.Scanner;

public class HeadsNTails {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of time to filp the coin : ");
		int times = s.nextInt();
		double heads = 0;
		for (int i = 0; i < times; i++) 
		{
			if (Math.random() > 0.5) {
				heads++;
			}
		}
	System.out.println("Heads percentage is " +  (heads / times) * 100);
	System.out.println("Tails percentage is " +  (times - heads) / times * 100);
	}
	
}

