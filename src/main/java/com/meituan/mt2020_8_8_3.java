package com.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/08/08     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/8/8 5:13 PM
 * @since 1.0.0
 * 题目描述：
 * 外卖节即将过去了，小美还有很代金券没有消费掉，美团面向小美这样的用户推出了一个新的活动，即代金券消消乐活动。系统会把小美的代金券打乱顺序排成一排，小美可以进行任意多次如下操作：
 * <p>
 * 如果存在相邻的两个代金券金额相等,设其面额为x，小美可以使用这两张代金券换一张面额为x+1的代金券，并将其仍放在原来两张券的位置上，每进行一次这样的操作，小美就可以获得1元可以无限期使用的奖励金。
 * <p>
 * 小美觉得奖励金可太香了，因此她想获得尽可能多的奖励金，请问她最多可以获得多少奖励金。
 * <p>
 * <p>
 * <p>
 * 输入描述
 * 输入第一行仅包含一个正整数n，表示小美拥有的代金券数量。(1<=n<=500)
 * <p>
 * 输入第二行包含n个正整数，每个整数x表示一张代金券的面额，同时这也是系统排出的代金券顺序。(1<=x<=100)
 * <p>
 * 输出描述
 * 输出仅包含一个整数，表示小美最多可以获得的奖励金数量。
 * <p>
 * <p>
 * 样例输入
 * 5
 * 1 1 1 1 1
 * 样例输出
 * 3
 */
public class mt2020_8_8_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a.add(in.nextInt());
		}

		while (true) {
			if (isTrue(a)) {
				for (int i = 1; i < a.size() - 1; i++) {
					if (a.get(i - 1) == a.get(i)) {
						a.set(i, a.get(i) + 1);
						a.remove(i - 1);
						sum += 1;
					}
				}
			} else {
				break;
			}
		}
		System.out.print(sum);
	}

	public static boolean isTrue(List<Integer> a) {
		for (int i = 1; i < a.size() - 1; i++) {
			if (a.get(i - 1) == a.get(i)) {
				return true;
			}
		}
		return false;
	}
}
