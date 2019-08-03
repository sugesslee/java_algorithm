package com.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/08/03     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019-08-03 09:42
 * @since 1.0.0
 */
public class SellingEquipment {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float D = in.nextFloat();

		Map<String, Integer> result = get_M_N(D);
		assert result != null;
		System.out.print(result.get("M") + " ");
		System.out.println(result.get("N"));
	}

	private static Map<String, Integer> get_M_N(float D) {
		for (int i = 1; i <= 10000; i++) {
			float M = D * i;

			int tmp = (int) M;
			Map<String, Integer> result = new HashMap<>();
			if (M - tmp < 0.00000001 && tmp != 0) {
				result.put("M", tmp);
				result.put("N", i);
				return result;
			}
		}
		return null;
	}
}
