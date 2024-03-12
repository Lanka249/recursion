package com.recursion;

import java.util.Scanner;

//finding of nth fibonacci number using multiple recursive calls
public class RecursionExample10 {
	public static int fibonacciNumber(int n) {
		if (n <= 2) {
			return n-1;
		}
		return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the user input number:");
		int n = scanner.nextInt();
		System.out.println("Required fibonacci number is: " + fibonacciNumber(n));
	}
}
