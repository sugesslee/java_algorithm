package com.lanqiaobei.template;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/01/15     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/1/15 10:29 AM
 * @since 1.0.0
 */
public class Main1 {
	static void show(byte[][] buf) {
		for (int i = 0; i < buf.length; i++) {
			for (int j = 0; j < buf[i].length; j++) {
				System.out.print(buf[i][j] == 0 ? ' ' : 'o');
			}
			System.out.println();
		}
	}

	static void draw(byte[][] buf, int x, int y, int size) {
		if (size == 1) {
			buf[y][x] = 1;
			return;
		}
		System.out.println(size);
		// x=4 y=4 size=9
		// 4,1 4,4 4,7
		int n = size / 3;  // 填空
//		System.out.println(n);
		draw(buf, x, y, n);
		draw(buf, x - n, y, n);
		draw(buf, x + n, y, n);
		draw(buf, x, y - n, n);
		draw(buf, x, y + n, n);
	}

	public static void main(String[] args) {
		final int N = 3;
		int t = 1;
		for (int i = 0; i < N; i++) t *= 3;

		byte[][] buf = new byte[t][t];
		draw(buf, t / 2, t / 2, t);
		show(buf);
	}
}
