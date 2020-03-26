package com.lanqiaobei.the11;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/01/15     red       -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/1/15 1:21 PM
 * @since 1.0.0
 * 【样例输入】
 * 3
 * 17:48:19 21:57:24
 * 11:05:18 15:14:23
 * 17:21:07 00:31:46 (+1)
 * 23:02:41 16:13:20 (+1)
 * 10:19:19 20:41:24
 * 22:19:04 16:41:09 (+1)
 * <p>
 * 【样例输出】
 * 04:09:05
 * 12:10:39
 * 14:22:05
 */
public class sixth {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String N = in.nextLine();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 2 * Integer.parseInt(N); i++) {
			list.add(in.nextLine());
		}
		for (int i = 0; i < Integer.parseInt(N) * 2; i += 2) {
			String[] tempList = list.get(i).split(" ");
			String result1 = "";
			if (tempList.length == 2) {
				result1 = timeSub(tempList[0], tempList[1], null);
			} else {
				String day = tempList[2].substring(2, 3);
				result1 = timeSub(tempList[0], tempList[1], day);
			}

			String[] tempList1 = list.get(i + 1).split(" ");
			String result2;
			if (tempList1.length == 2) {
				result2 = timeSub(tempList1[0], tempList1[1], null);
			} else {
				String day = tempList1[2].substring(2, 3);
				result2 = timeSub(tempList1[0], tempList1[1], day);
			}
			System.out.println(avgTime(result1, result2));
		}
	}

	/**
	 * @param start 开始时间
	 * @param end   结束时间
	 * @param day   天数
	 * @return result
	 */
	private static String timeSub(String start, String end, String day) {
		if (day == null) {
			return subTime(start, end);
		} else {
			if (day.equals("1")) {
				String tempTime = "23:59:60";
				return addTime(subTime(start, tempTime), end);
			} else {
				String tempTime = "23:59:60";
				String temp1 = subTime(start, tempTime);
				String temp2 = addTime(temp1, tempTime);

				return addTime(temp2, end);
			}
		}
	}

	/**
	 * @param firstTime  开始时间
	 * @param secondTime 结束时间
	 * @return result
	 */
	private static String avgTime(String firstTime, String secondTime) {
		String[] firstTimeList = firstTime.split(":");
		String[] secondTimeList = secondTime.split(":");

		int flag = 0;
		StringBuilder result = new StringBuilder();
		for (int i = firstTimeList.length - 1; i >= 0; i--) {
			int temp = 0;
			if (flag > 0) {
				temp = (Integer.parseInt(firstTimeList[i]) + Integer.parseInt(secondTimeList[i])) / 2 + 1;
				flag = 0;
			} else {
				temp = (Integer.parseInt(firstTimeList[i]) + Integer.parseInt(secondTimeList[i])) / 2;
			}
			if (temp > 60) {
				flag = 1;
			}
			result.insert(0, ":" + (String.valueOf(temp).length() == 1 ? "0" + temp : temp));
		}
		return result.toString().substring(1);
	}


	/**
	 * @param start 开始时间
	 * @param end   结束时间
	 * @return result
	 */
	private static String subTime(String start, String end) {
		String[] startList = start.split(":");
		String[] endList = end.split(":");

		StringBuilder result = new StringBuilder();
		int flag = 0;
		for (int i = startList.length - 1; i >= 0; i--) {
			int temp = 0;
			if (flag > 0) {
				temp = (Integer.parseInt(endList[i]) - Integer.parseInt(startList[i])) - 1;
				flag = 0;
			} else {
				temp = (Integer.parseInt(endList[i]) - Integer.parseInt(startList[i]));
				if (temp < 0) {
					temp += 60;
					flag = 1;
				}
			}
			result.insert(0, ":" + (String.valueOf(temp).length() == 1 ? "0" + temp : temp));
		}
		return result.toString().substring(1);
	}

	/**
	 * @param start 开始时间
	 * @param end   结束时间
	 * @return result
	 */
	private static String addTime(String start, String end) {
		String[] startList = start.split(":");
		String[] endList = end.split(":");

		StringBuilder result = new StringBuilder();
		int flag = 0;
		for (int i = startList.length - 1; i >= 0; i--) {
			int temp = 0;
			if (flag > 0) {
				temp = (Integer.parseInt(endList[i]) + Integer.parseInt(startList[i])) + 1;
				if (temp > 60) {
					temp -= 60;
					flag = 1;
				} else {
					flag = 0;
				}
			} else {
				temp = (Integer.parseInt(endList[i]) + Integer.parseInt(startList[i]));
				if (temp > 60) {
					temp -= 60;
					flag = 1;
				}
			}
			result.insert(0, ":" + (String.valueOf(temp).length() == 1 ? "0" + temp : temp));
		}
		return result.toString().substring(1);
	}
}
