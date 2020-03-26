package com.meituan;

import java.util.*;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/24     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/24 9:30 AM
 * @since 1.0.0
 */
public class minPrefix {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		List<String> inputList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			inputList.add(in.next());
		}

		getPrefix(inputList);
	}

	/*	5
		meituanapp
				meituanwaimai
		dianpingliren
				dianpingjiehun
		mt*/
	private static void getPrefix(List<String> inputList) {
		Map<String, List<String>> mList = new HashMap<>();
		for (String element : inputList) {
			for (int i = 0; i < inputList.size(); i++) {
				if (inputList.get(i).contains(element.substring(0, 1))) {
					
				}
			}
		}
	}
}
