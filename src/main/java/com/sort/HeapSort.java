package com.sort;

import java.util.Arrays;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/29     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/29 2:07 PM
 * @since 1.0.0
 */
public class HeapSort {
	public static void main(String[] args) {
		int[] arr = new int[]{
				8, 7, 5, 3, 9, 2, 6, 1, 0, 4
		};
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * 堆排序
	 *
	 * @param arr 数组
	 */
	private static void heapSort(int[] arr) {
		// 构建大顶堆
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			// 从第一个非叶子节点开始构建大顶堆
			adjust(arr, i, arr.length);
		}
		// 交换堆顶元素和末尾元素，调整为大顶堆
		for (int j = arr.length - 1; j > 0; j--) {
			swap(arr, 0, j);
			adjust(arr, 0, j);
		}
	}

	/**
	 * 调整大顶堆
	 *
	 * @param arr    数组
	 * @param i      第i各元素调整
	 * @param length 数组长度
	 */
	private static void adjust(int[] arr, int i, int length) {
		int tmp = arr[i];
		// 从左孩子节点开始循环
		for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {
			// 左孩子小于右孩子，k指向右孩子节点
			if (k + 1 < length && arr[k] < arr[k + 1]) {
				k++;
			}
			// 右孩子大于父节点，子节点的值赋给父节点
			if (arr[k] > tmp) {
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
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
