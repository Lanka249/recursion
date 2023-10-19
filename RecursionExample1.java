package com.recursion;

import java.util.Scanner;

public class RecursionExample1 {
	public static void name(int i, int n) {
		if (i > n) {
			return;
		} else {
			System.out.println("hello " + i);
		}
		name(i + 1, n);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = scan.nextInt();
		name(1, n);
	}
}
