package com.recursion;

import java.util.Scanner;

//printing numbers from n to 1 
public class RecursionExample3 {
	public static void print(int n) {
		if (n == 0) {
			return;
		}
		System.out.print(n + " ");
		print(n - 1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = scan.nextInt();
		print(n);
	}
}
