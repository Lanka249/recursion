package com.recursion;

import java.util.Scanner;

//printing sum of N numbers 
public class RecursionExample6 {

	public static int sum(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sum(n - 1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		System.out.println("sum is: " + sum(n));
	}

}
