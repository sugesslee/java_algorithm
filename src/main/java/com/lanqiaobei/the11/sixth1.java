package com.lanqiaobei.the11;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

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
public class sixth1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String N = in.nextLine();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 2 * Integer.parseInt(N); i++) {
			list.add(in.nextLine());
		}
		for (int i = 0; i < Integer.parseInt(N) * 2; i += 2) {
			String[] tempList = list.get(i).split(" ");
			long result1;
			if (tempList.length == 2) {
				result1 = timeProcess(tempList[0], tempList[1], null);
			} else {
				String day = tempList[2].substring(2, 3);
				result1 = timeProcess(tempList[0], tempList[1], day);
			}

			String[] tempList1 = list.get(i + 1).split(" ");
			long result2;
			if (tempList1.length == 2) {
				result2 = timeProcess(tempList1[0], tempList1[1], null);
			} else {
				String day = tempList1[2].substring(2, 3);
				result2 = timeProcess(tempList1[0], tempList1[1], day);
			}
			System.out.println(secToTime(result1, result2));
		}
	}

	public static long timeProcess(String start, String end, String day) {
		if (day == null) {
			return (timeToSec(end) - timeToSec(start));
		} else if (day.equals("1")) {
			// 结束时间小时加24
			end = (Integer.parseInt(end.split(":")[0]) + 24) + end.substring(2);
			return (timeToSec(end) - timeToSec(start));
		} else {
			// 结束时间小时加48
			end = (Integer.parseInt(end.split(":")[0]) + 48) + end.substring(2);
			return (timeToSec(end) - timeToSec(start));
		}
	}

	private static long timeToSec(String time) {
		String[] temp = time.split(":");
		return Long.parseLong(temp[2]) + Long.parseLong(temp[1]) * 60 + Long.parseLong(temp[0]) * 3600;
	}

	private static String secToTime(long sec1, long sec2) {
		long result = (sec2 + sec1) / 2;
		String h = String.valueOf(result / 3600);
		String m = String.valueOf((result % 3600) / 60);
		String s = String.valueOf(((result % 3600) % 60));

		return (h.length() == 1 ? "0" + h : h) + ":" + (m.length() == 1 ? "0" + m : m) + ":" + (s
				.length() == 1 ? "0" + s : s);
	}
}
