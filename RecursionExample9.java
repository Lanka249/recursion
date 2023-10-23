package com.recursion;

import java.util.Scanner;

// Palindrome string checking using recursion
public class RecursionExample9 {
	public static boolean palindromeString(String str, int i) {
		int n = str.length();
		if (i >= n / 2) {
			return true;
		} else if (str.charAt(i) != str.charAt(n - 1 - i)) {
			return false;
		}
		return palindromeString(str, i + 1);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the user string:");
		String str = scanner.nextLine();
		System.out.println(palindromeString(str, 0));
	}
}
