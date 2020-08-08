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
	// 头结点
	LinkNode head = null;

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addNode(3);
		linkedList.addNode(4);
		linkedList.addNode(5);

		linkedList.printLinkList();
	}

	/**
	 * 添加节点
	 *
	 * @param data 节点的数据
	 */
	public void addNode(int data) {
		LinkNode newNode = new LinkNode(data);
		if (head == null) {
			head = newNode;
			return;
		}
		LinkNode tmp = head;
		while (tmp.getNext() != null) {
			tmp = tmp.getNext();
		}
		tmp.setNext(newNode);
	}

	/**
	 * 链表反转
	 *
	 * @param head 头结点
	 * @return 反转后的头结点
	 */
	public LinkNode reversal(LinkNode head) {
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

	/**
	 * 打印链表
	 */
	public void printLinkList() {
		LinkNode node = head;
		while (node.getNext() != null) {
			System.out.print(node);
			node = node.getNext();
		}
	}
}
