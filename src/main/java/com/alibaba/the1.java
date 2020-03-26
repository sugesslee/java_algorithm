package com.alibaba;

import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/20     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/20 8:32 AM
 * @since 1.0.0
 */
public class the1 {
	public static void main(String[] args) {
//		1 1 1 2 2 2 2 2 1 1
//		3
		Scanner in = new Scanner(System.in);
		int[] input = new int[10];

		for (int i = 0; i < 10; i++) {
			input[i] = in.nextInt();
		}
//		int result = temp(input);
//		System.out.println(result);
//		System.out.println(Arrays.toString(splitInt(input, 1)));
	}

	public int process(int[] arr) {
		for (int i = 0; i < 10; i++) {
			if (arr[i] == 0) {

			} else if(arr[i]==1){

			}
			else if(arr[i]==2){

			}
		}
		return 0;
	}

//
//	public static int temp(int[] arr) {
//		int sum = sumArr(arr);
//		int len = arr.length;
//		// 一张牌
//		if (sum == 1) {
//			return 1;
//		} else if (sum == 2) {
//			for (int i = 0; i < 10; i++) {
//				if (arr[i] == 1) {
//					return 2;
//				}
//				if (arr[i] == 2) {
//					return 1;
//				}
//			}
//		} else if (sum == 5) {
//			// 递归
//			if (arr[0] == 1 && arr[ 1] == 1 && arr[2] == 1 && arr[3] == 1 && arr[4] == 1) {
//				return 1;
//			} else if (arr[i] == 1 && (arr[i + 1] == 1 || arr[i + 1] == 0 || arr[i + 1] == 2)) {
//				return temp(splitInt(arr, i)) + 1;
//			} else {
//				return temp(splitInt(arr, i + 1));
//			}
//		}
//	}
////		else if (sum == 6) {
////			for (int i = 0; i < 10; i++) {
////				if (arr[i] == 2 && arr[i + 1] == 2 && arr[i + 2] == 2) {
////					return 1;
////				} else {
////					if (arr[i] == 1 && (arr[i + 1] == 1 || arr[i + 1] == 0 || arr[i + 1] == 2)) {
////						return temp(splitInt(arr, i)) + 1;
////					}
////				}
////			}
////		} else {
////			return temp(splitInt(arr, 1)) + 1;
////		}
//		return 1;
//}
//
//
//	public static int[] splitInt(int[] arr, int i) {
//		int newLen = arr.length - i;
//		int[] temp = new int[newLen];
//		System.arraycopy(arr, i, temp, 0, newLen);
//		return temp;
//	}
//
//	public static int sumArr(int[] arr) {
//		int sum = 0;
//		for (int value : arr) {
//			sum += value;
//		}
//		return sum;
//	}
}
