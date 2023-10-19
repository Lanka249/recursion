package com.recursion;

import java.util.Scanner;

//printing 1 to n numbers by backtracking
public class RecursionExample4 {

	public static void print(int i, int n) {
		if (i < 1) {
			return;
		}
		print(i - 1, n);
		System.out.print(i + " ");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = scanner.nextInt();
		print(n, n);
	}

}
