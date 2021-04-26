package com.sz.ds.list;

public class SSLMain {

	public static void main(String[] args) {

		SinglyLinkedList linkedList = new SinglyLinkedList();
		
		linkedList.add(50);
		linkedList.add(60);
		linkedList.add(70);
		linkedList.add(80);
		
//		System.out.println(linkedList);
		linkedList.reverse();
		System.out.println(linkedList);
		
		
		
	}

}
