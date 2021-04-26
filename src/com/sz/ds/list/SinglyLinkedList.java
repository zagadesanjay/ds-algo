package com.sz.ds.list;

public class SinglyLinkedList {

	private Node head;

	class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	public void add(int val) {
		Node node = new Node(val);
		if (head == null) {
			head = node;
		} else {
			Node last = head;

			while (last.next != null) {
				last = last.next;
			}
			last.next = node;
		}
	}

	public void reverse() {

		Node prev, current, next;

		prev = null;
		current = head;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public String toString() {
		String str = "";

		Node temp = head;
		while (temp != null) {

			str = str + temp.val + "  ";
			temp = temp.next;
		}
		return str;
	}

}
