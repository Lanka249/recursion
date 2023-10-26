package com.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//printing all sub-sequences of an Integer array
public class RecursionExample12 {
	public static void subSeque(int[] a, int i, List<Integer> list) {
		if (i >= a.length) {
			System.out.println(list);
			return;
		}
		list.add(a[i]);
		subSeque(a, i + 1, list);
		list.remove(list.size() - 1);
		subSeque(a, i + 1, list);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int l = scanner.nextInt();
		int[] a = new int[l];
		for (int i = 0; i < l; i++) {
			System.out.println("Enter the element to be added:");
			int ele = scanner.nextInt();
			a[i] = ele;
		}
		System.out.println("Subsequences of given array are:");
		List<Integer> list = new ArrayList<>();
		subSeque(a, 0, list);
	}
}
