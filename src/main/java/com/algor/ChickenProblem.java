package com.algor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/09/15     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/9/15 8:52 PM
 * @since 1.0.0
 * 百钱百鸡问题
 * 输入N总钱数
 * 输出 c:共有c种解法 s:公鸡数量
 */
public class ChickenProblem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int cock, hen, chick;
		int count = 0;
		int cockSum = 0;
		for (cock = 0; cock <= 100; cock++) {
			hen = (N - 7 * cock) / 4;
			chick = (3 * N + 3 * cock) / 4;
			if (hen <= 0 || chick <= 0) {
				break;
			}
			if ((chick % 3 == 0) && (cock + hen + chick == N) && (cock * 5 + hen * 3 + chick / 3 == N)) {
//				List temp = new ArrayList();
//				temp.add(0, cock);
//				temp.add(1, hen);
//				temp.add(2, chick);
//				result[count][0] = cock;
//				result[count][1] = hen;
//				result[count][2] = chick;
//				resultLst.add(temp);
				cockSum += cock;
				count += 1;
			}
		}
		if (count == 0) {
			System.out.print(count + " " + -1);
		} else {
			System.out.print(count + " " + cockSum);
		}
	}
}
