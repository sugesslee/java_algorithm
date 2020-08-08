package com.test;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/27     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/27 8:09 AM
 * @since 1.0.0
 */
public class fib {

	public static void main(String[] args) {
		int N = 10;
		int[] fibArr = new int[N + 1];
		System.out.println(fibonacci(fibArr, N));
		System.out.println(fibonacciByDynamicPro(N));
		System.out.println(fibonacciByDynamicProgram(N));
	}

	/**
	 * 递归法解决fibonacci，将计算的每个结果保存，不重复计算
	 *
	 * @param fibArr 保存每次计算结果
	 * @param n      循环次数
	 * @return 结果
	 */
	private static int fibonacci(int[] fibArr, int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		if (fibArr[n] != 0) {
			return fibArr[n];
		}
		fibArr[n] = fibonacci(fibArr, n - 1) + fibonacci(fibArr, n - 2);
		return fibArr[n];
	}

	/**
	 * 动态规划求解
	 *
	 * @param n 求n的fibonacci
	 * @return result
	 */
	private static int fibonacciByDynamicPro(int n) {
		int[] arr = new int[n + 1];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;

		for (int i = 3; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n];
	}

	/**
	 * 动态规划减少空间复杂度
	 *
	 * @param n n
	 * @return result
	 */
	private static int fibonacciByDynamicProgram(int n) {
		if (n < 2) {
			return n;
		}
		int pre = 0;
		int curr = 1;

		for (int i = 0; i < n - 1; i++) {
			int sum = pre + curr;
			pre = curr;
			curr = sum;
		}
		return curr;
	}
}
