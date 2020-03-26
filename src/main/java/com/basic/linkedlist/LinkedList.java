package com.basic.linkedlist;

/**
 * <pre>
 *  Version         Date            Author          Description
 * ------------------------------------------------------------
 *  1.0.0           2020/03/11     red        -
 * </pre>
 *
 * @author red
 * @version 1.0.0 2020/3/11 11:28 AM
 * @since 1.0.0
 */
public class LinkedList {
	public static void main(String[] args) {
		LinkNode head = new LinkNode(0);
		LinkNode node1 = new LinkNode(1);
		LinkNode node2 = new LinkNode(2);
		LinkNode node3 = new LinkNode(3);
		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);

		System.out.println(head);

		LinkNode tmpHead = reversal(head);
		System.out.println(tmpHead);
	}

	public static LinkNode reversal(LinkNode head) {
		if (head == null || head.getNext() == null) {
			return head;
		}
		// 上一个节点
		LinkNode preNode = head;
		// 当前节点
		LinkNode curNode = head.getNext();

		LinkNode tmpNode;
		while (curNode != null) {
			tmpNode = curNode.getNext();
			curNode.setNext(preNode);

			preNode = curNode;
			curNode = tmpNode;
		}
		head.setNext(null);

		return preNode;
	}
}
