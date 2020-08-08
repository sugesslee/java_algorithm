package com.test;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/27     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/27 9:38 AM
 * @since 1.0.0
 */
public class CoinCharge {
	public static void main(String[] args) {
		int[] coins = new int[]{1, 2, 5};
		int amount = 11;

		System.out.println(coinCharge(coins, amount));
	}

	/**
	 * @param coins  已有的零钱
	 * @param amount 总金额
	 * @return 需要几张钱
	 */
	private static int coinCharge(int[] coins, int amount) {
		if (amount == 0)
			return amount;
		int result = Integer.MAX_VALUE;
		for (int coin : coins) {
			// 金额不可达
			if (amount - coin < 0) {
				continue;
			}
			// 求解子问题
			int subProb = coinCharge(coins, amount - coin);
			if (subProb == -1) continue;
			result = Math.min(result, subProb + 1);
		}
		return result == Integer.MAX_VALUE ? -1 : result;
	}
}
