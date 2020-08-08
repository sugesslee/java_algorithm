package com.baidu.javadev;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/29     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/29 7:37 PM
 * @since 1.0.0
 */
public class huanyuanshulie {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigInteger[] arr = new BigInteger[n];
		in.nextLine();
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextBigInteger();
		}
		heapSort(arr, n);
	}

	private static void heapSort(BigInteger[] arr, int n) {
		// 构建大顶堆
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			// 从第一个非叶子节点开始构建大顶堆
			adjust(arr, i, arr.length);
		}
		// 交换堆顶元素和末尾元素，调整为大顶堆
		int k = 0;
		while (arr[0].compareTo(new BigInteger(String.valueOf(n))) >= 0) {
			swap(arr, 0, n - 1, n);
			for (int i = 0; i < n - 2; i++) {
				arr[i] = arr[i].add(new BigInteger(String.valueOf(1)));
			}
			adjust(arr, 0, n - 1);
			k += 1;
		}
		System.out.println(k);
	}

	private static void adjust(BigInteger[] arr, int i, int length) {
		BigInteger tmp = arr[i];
		// 从左孩子节点开始循环
		for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {
			// 左孩子小于右孩子，k指向右孩子节点
			if (k + 1 < length && arr[k].compareTo(arr[k + 1]) < 0) {
				k++;
			}
			// 右孩子大于父节点，子节点的值赋给父节点
			if (arr[k].compareTo(tmp) > 0) {
				arr[i] = arr[k];
				i = k;
			} else {
				break;
			}
		}
		arr[i] = tmp;
	}


	/**
	 * @param arr 需要交换元素的数组
	 * @param i   交换的位置
	 * @param j   交换的位置
	 */
	private static void swap(BigInteger[] arr, int i, int j, int n) {
		BigInteger temp = arr[i];
		arr[i] = arr[j].subtract(new BigInteger(String.valueOf(n)));
		arr[j] = temp;
	}
}
