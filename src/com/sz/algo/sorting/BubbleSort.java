package com.sz.algo.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 5, 12, 3, 11, 2 };

//		for (int i = arr.length - 2; i >= 0; i--) {
//			System.out.println("assd");
//			for (int j = 0; j <= i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
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
