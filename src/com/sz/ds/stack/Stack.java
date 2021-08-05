package com.sz.ds.stack;

public class Stack {

	int arr[] = new int[3];

	int top = -1;

	public static void main(String[] args) {

	}

	public void push(int x) {
		if (top == arr.length - 1) {
			throw new StackOverflowError("Overflow");
		} else {
			top++;
			arr[top] = x;
		}
	}

	public int pop() {
		if (top < 0) {
			System.out.println();
			return 0;
		} else {
			return arr[top--];
		}
	}

	public int peek() {
		return arr[top];
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return false;
	}

}
