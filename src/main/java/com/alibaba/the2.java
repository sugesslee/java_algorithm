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
public class the2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		String[] strs = new String[n];
		for (int i = 0; i < n; i++) {
			strs[i] = in.next();
		}

		int sum = 0;
		for (int i = 0; i < strs.length; i++) {
			for (int j = 0; j < strs.length; j++) {
				if (strs[i].charAt(strs[i].length()-1)<strs[j].charAt(0)){

				}
			}
		}
	}
}

class Solution2 {

}
