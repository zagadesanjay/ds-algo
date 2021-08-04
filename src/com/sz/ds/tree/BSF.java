package com.sz.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BSF {

	Node root;

	public static void main(String[] args) {

		BSF bsf = new BSF();

		bsf.root = new Node(1);
		bsf.root.left = new Node(2);
		bsf.root.right = new Node(2);

		bsf.root.left.left = new Node(3);
		bsf.root.left.right = new Node(3);

		bsf.root.right.left = new Node(3);
		bsf.root.right.right = new Node(3);

		bsf.root.left.left.left = new Node(4);
		bsf.root.left.left.right = new Node(4);

		bsf.traverse(bsf.root);

	}

	private void traverse(Node root) {

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty()) {

			int size = queue.size();
			while (size > 0) {
				Node node = queue.poll();
				if (node.left != null)
					queue.add(node.left);

				if (node.right != null)
					queue.add(node.right);
				System.out.print(node.val);
				size--;
			}

			System.out.println();

		}

	}
}

class Node {

	int val;
	Node left, right;

	public Node(int val) {
		super();
		this.val = val;
	}

}
