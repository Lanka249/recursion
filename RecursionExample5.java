package com.recursion;

import java.util.Scanner;

//printing numbers from n to 1 by backtracking 
public class RecursionExample5 {

	public static void print(int i, int n) {
		if (i > n) {
			return;
		}
		print(i + 1, n);
		System.out.print(i + " ");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = scanner.nextInt();
		print(1, n);
	}
}
