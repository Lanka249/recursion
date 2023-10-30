package com.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//printing number of subsequences whose sum is k
public class RecursionExample16 {
	static List<Integer> list = new ArrayList<>();
	static int sum = 0;
	static int c = 0;
	public static int subSequeSum(int[] a, int i, int k,List<Integer> list) {
		if (i >= a.length) {
			if (sum == k) {
				System.out.println(list);
				return 1;
			}
			return 0;
		}
		list.add(a[i]);
		sum += a[i];
		int l = subSequeSum(a, i + 1, k,list);
		list.remove(list.size() - 1);
		sum -= a[i];
		int r = subSequeSum(a, i + 1, k,list);
		return l+r;
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
		System.out.println("Number of subsequences whose sum "+k+" are:"+subSequeSum(a, 0, k,list));
	}
}