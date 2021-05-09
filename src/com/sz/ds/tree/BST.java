package com.sz.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

	class Node {
		int data;
		Node left, right;
	}

	private Node root;

	public void insert(int data) {
		root = insert(root, data);
	}

	private Node insert(Node root, int data) {
		if (root == null) {
			root = getNode(data);
		} else {
			if (data <= root.data) {
				root.left = insert(root.left, data);
			} else {
				root.right = insert(root.right, data);
			}
		}
		return root;
	}

	public Node search(int data) {
		return null;
	}

	
	
	//Height
	
	public int getHeight() {
		return getHeight(root);
	}
	
	private int getHeight(Node root) {
		
		if(root ==  null) {
			return -1;
		}
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		
		return Math.max(leftHeight, rightHeight) +1;
	}
	
	//BFS - Level order traversal
	
	public void BFS() {
		inOrder(root);
	}
	
	public void BFS(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.print(temp.data + " ");
			queue.add(temp.left);
			queue.add(temp.right);
			
		}
	}
	
	
	// Traversals 
	public void inOrder() {
		inOrder(root);
	}

	public void preOrder() {
		preOrder(root);
	}
	
	public void postOrder() {
		postOrder(root);
	}

	private void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	
	private void postOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			inOrder(root.right);
			System.out.println(root.data);
		}
	}
	
	
	

	private Node getNode(int data) {
		Node node = new Node();
		node.data = data;
		return node;
	}

}
