package com.recursion;

import java.util.Scanner;

//printing factorial of a number
public class RecursionExample7 {
	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		System.out.println("Factorial of " + n + " is: " + factorial(n));
	}
}
