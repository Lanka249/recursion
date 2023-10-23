package com.recursion;

import java.util.Arrays;
import java.util.Scanner;

//Reversing an integer array using recursion
public class RecursionExample8 {
	public static void reverse(int[] a, int i) {
		int n = a.length;
		if (i >= n / 2) {
			System.out.println(Arrays.toString(a));
			return;
		}
		else {
			int temp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;
			reverse(a, i + 1);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int l = scanner.nextInt();
		int[] a = new int[l];
		for (int i = 0; i < l; i++) {
			System.out.println("Enter the elment to be added:");
			int ele = scanner.nextInt();
			a[i] = ele;
		}
		reverse(a, 0);
	}

}
