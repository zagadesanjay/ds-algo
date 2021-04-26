package com.sz.algo.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 5, 12, 3, 11, 2 };

		for (int i = arr.length - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i : arr) {
			System.out.println(i);
		}

	}

}
