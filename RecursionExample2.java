package com.recursion;

import java.util.Scanner;

//printing 1 to n numbers
public class RecursionExample2 {

	public static void print(int i, int n) {
		if (i > n) {
			return;
		}
		System.out.print(i + " ");
		print(i + 1, n);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = scan.nextInt();
		print(1, n);
	}
}
