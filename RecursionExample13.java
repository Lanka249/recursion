package com.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//printing all sub-sequences of a string
public class RecursionExample13 {
	static List<String> list = new ArrayList<>();
	public static void subSeque(String s, String res) {
		if (s.length() == 0) {
			list.add(res);
			System.out.println(list);
			list.remove(res);
			return;
		}
		subSeque(s.substring(1), res + s.charAt(0));
		subSeque(s.substring(1), res);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the user string:");
		String s = scan.nextLine();
		System.out.println("Subsequences of given string are:");
		subSeque(s, "");
	}
}
