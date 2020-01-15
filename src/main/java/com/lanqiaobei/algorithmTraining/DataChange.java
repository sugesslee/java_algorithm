package com.lanqiaobei.algorithmTraining;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataChange {
	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		Map<String, Integer> temp = swap(a, b);
		System.out.print(temp.get("a") + " " + temp.get("b"));
	}

	private static Map<String, Integer> swap(int a, int b) {
		Map<String, Integer> result = new HashMap<>();
		result.put("a", b);
		result.put("b", a);
		return result;
	}
}
