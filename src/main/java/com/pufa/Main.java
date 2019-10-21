package com.pufa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/10/21     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/10/21 6:08 PM
 * @since 1.0.0
 */
public class Main {
	public static void main(String[] args) {

		List<String> out = new ArrayList<>();

		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();

			boolean pri = isPrime(a * a - b * b);
			out.add(pri ? "YES" : "NO");
		}


//		for (String element : out) {
//			System.out.println(element);
//		}

		for (int i = 0; i < t; i++) {
			if (i == t - 1) {
				System.out.print(out.get(i));
			} else {
				System.out.println(out.get(i));
			}
		}
	}

	private static boolean isPrime(int num) {
		boolean is_Prime = true;
		int len = num / 2;
		for (int i = 2; i < len; i++) {
			if (num % i == 0) {
				is_Prime = false;
				break;
			}
		}
		return is_Prime;
	}
}
