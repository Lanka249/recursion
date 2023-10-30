package com.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//printing anyone array sub-sequence whose sum k
public class RecursionExample15 {
	static List<Integer> list = new ArrayList<>();
	static int sum = 0;
	public static boolean subSequeSum(int[] a, int i, List<Integer> list, int k) {
		if (i >= a.length) {
			if (sum == k) {
				System.out.println(list);
				return true;
			}
			return false;
		}
		list.add(a[i]);
		sum += a[i];
		if (subSequeSum(a, i + 1, list, k)) {
			return true;
		}
		list.remove(list.size() - 1);
		sum -= a[i];
		if (subSequeSum(a, i + 1, list, k)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the element to be added:");
			a[i] = scanner.nextInt();
		}
		System.out.println("Enter the value of sub-sequence sum:");
		int k = scanner.nextInt();
		System.out.println("Required subsequences are:");
		subSequeSum(a, 0, list, k);
	}
}
