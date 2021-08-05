package com.sz.ds.tree;

import java.util.*;

public class KthSmallestInBST {
	
	
	static class Node {
		
		int data;
		Node left, right;
		
		public Node(int data) {
			this.data= data;
		}
		
		
	}

	public static void main(String[] args) {

		Node five = new Node(5);
		Node three = new Node(3);
		Node six = new Node(6);
		Node two = new Node(2);
		Node four = new Node(4);
		Node seven = new Node(7);
		
		five.left = three;
		three.left = two;
		three.right = four;
		five.right= six;
		six.right = seven;
		
		System.out.println(kthSmallest(five, 2));
		
	}
	
	private static int kthSmallest(Node root, int k){
		
		List<Integer>  list = new ArrayList<>();
		
		inorder(root, list);
		
		System.out.println(list);
		
		return list.get(k-1);
		
	}
	
	
	private static List<Integer> inorder(Node root, List<Integer> list){
		
		if (root == null)
			 return list;
		
		inorder(root.left, list);
		list.add(root.data);
		inorder(root.right, list);
		
		return list;
		
		
	}

}
