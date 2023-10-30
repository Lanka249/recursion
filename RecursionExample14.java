package com.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//printing array sub-sequences whose sum k
public class RecursionExample14 {
	static List<Integer> list = new ArrayList<>();
	static int sum = 0;
	public static void subSequeSum(int[] a, int i, List<Integer> list, int k) {
		if (i >= a.length) {
			if (sum == k) {
				System.out.println(list);
			}
			return;
		}
		list.add(a[i]);
		sum += a[i];
		subSequeSum(a, i + 1, list, k);
		list.remove(list.size() - 1);
		sum -= a[i];
		subSequeSum(a, i + 1, list, k);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=scanner.nextInt();
		int[] a=new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the element to be added:");
			a[i]= scanner.nextInt();
		}
		System.out.println("Enter the value of sub-sequence sum:");
		int k = scanner.nextInt();
		System.out.println("Required subsequences are:");
		subSequeSum(a, 0, list, k);
	}
}
