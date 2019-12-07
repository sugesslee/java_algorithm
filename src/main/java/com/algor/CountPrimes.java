package com.algor;

import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/10/21     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/10/21 8:47 PM
 * @since 1.0.0
 */
public class CountPrimes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(n);
		int result = countPrimes(n);
		System.out.print(result);

//		System.out.println(isPrime(2));
//		System.out.println(isPrime(3));
//		System.out.println(isPrime(4));
//		System.out.println(isPrime(5));
//		System.out.println(isPrime(6));
//		System.out.println(isPrime(7));
//		System.out.println(isPrime(8));
//		System.out.println(isPrime(9));
	}

	public static int countPrimes(int n) {

		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				count += 1;
			}
		}
		return count;
	}


	private static boolean isPrime(int num) {
		boolean is_Prime = true;
		int len = num / 2 + 1;
		for (int i = 2; i < len; i++) {
			if (num % i == 0) {
				is_Prime = false;
				break;
			}
		}
		return is_Prime;
	}
}
