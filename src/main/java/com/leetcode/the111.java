package com.leetcode;

import lombok.Data;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/20     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/20 8:09 AM
 * @since 1.0.0
 */
@Data
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class the111 {
	public static void main(String[] args) {
		Solution111 solution111 = new Solution111();
		int result = solution111.run(new TreeNode(5));
		System.out.println(result);
	}
}

class Solution111 {

	public int run(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.getLeft() == null) {
			return run(root.getRight()) + 1;
		}
		if (root.getRight() == null) {
			return run(root.getLeft()) + 1;
		}
		int leftDepth = run(root.getLeft()) + 1;
		int rightDepth = run(root.getRight()) + 1;

		return Math.min(leftDepth, rightDepth);
	}
}