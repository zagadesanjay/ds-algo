package com.sz.ds.list;

import java.util.*;

public class LinkedListLoop {

	public static void main(String[] args) {

		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node forth = new Node(4);
		Node fifth = new Node(5);

		Node head = first;

		head.next = second;
		head.next.next = third;
		head.next.next.next = forth;
		head.next.next.next.next = fifth;

		fifth.next = third;

		System.out.println(detectLoop(head));

	}

	private static boolean detectLoop(Node head) {

		HashSet<Node> set = new HashSet<>();
		while (head != null) {

			if (set.contains(head))
				return true;

			set.add(head);

			head = head.next;
		}
		return false;
	}

}

class Node {
	
	int data;

	Node next;

	public Node(int data) {
		super();
		this.data = data;
	}
}

