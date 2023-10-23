package com.recursion;

import java.util.Scanner;

//printing of N fibonacci numbers 
public class RecursionExample11 {
	static int n1 = 0;
	static int n2 = 1;
	static int n3 = 0;
	public static void fibonacciSeries(int n) {
		if (n > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			fibonacciSeries(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the user input number:");
		int n = scanner.nextInt();
		if (n >= 2) {
			System.out.print(n1 + " " + n2);
			fibonacciSeries(n - 2);
		} else if (n == 1) {
			System.out.print(n1);
		} else {
			System.out.println("Enter valid number");
		}
	}
}
