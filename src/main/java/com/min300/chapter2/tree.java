package com.min300.chapter2;


/**
 * 二叉搜索树
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2019/12/05     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2019/12/5 2:38 PM
 * @since 1.0.0
 * root = [3,1,4,null,2], k = 1
 * root = [5,3,6,2,4,null,null,1], k = 3
 */
public class tree {
	public static void main(String[] args) {

		Solution solution = new Solution();
		String str = "[5,3,6,2,4,null,null,1]";
		solution.kthSmallest(makeTree(str), 1);
	}

	public static TreeNode makeTree(String str) {
		int[] arr = strToIntArray(str);
		TreeNode[] treeNode = new TreeNode[arr.length + 1];

		for (int i = 1; i < treeNode.length; i++) {
			if (arr[i - 1] != Integer.MAX_VALUE) {
				treeNode[i] = new TreeNode(arr[i - 1]);
			} else {
				treeNode[i] = null;
			}
		}

		TreeNode tree;

		for (int i = 0; i < treeNode.length / 2; i++) {
			tree = treeNode[i];
			if (tree == null) continue;
			tree.left = treeNode[2 * i];
			tree.right = treeNode[2 * i + 1];
		}
		return treeNode[1];
	}

	public static int[] strToIntArray(String str) {
		String tmp = str.substring(1, str.length() - 1);
		String[] strs = tmp.split(",");
		int[] arr = new int[strs.length + 1];
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].equals("null")) {
				arr[i] = Integer.MAX_VALUE;
			} else {
				arr[i] = Integer.parseInt(strs[i]);
			}
		}
		return arr;
	}
}

class Solution {
	public int kthSmallest(TreeNode root, int k) {
		int result = 0;
		System.out.println(root);

		return result;
	}
}
