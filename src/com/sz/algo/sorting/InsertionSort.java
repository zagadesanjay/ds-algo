package com.sz.algo.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 5, 12, 3, 11, 2 };

		for (int i = 0; i < arr.length; i++) {

			int j = i - 1;

			int temp = arr[i];

			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = temp;

		}

		for (int a : arr) {
			System.out.println(a);
		}

	}

}
