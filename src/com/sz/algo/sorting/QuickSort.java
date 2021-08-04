package com.sz.algo.sorting;

public class QuickSort {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 2, 54, 32, 0, 6, 78 };

		quickSort(arr, 0, arr.length - 1);

		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	private static void quickSort(int[] arr, int start, int end) {
		if (start < end) {
			int partitionIndex = partition(arr, start, end);
			quickSort(arr, start, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pIndex = start;

		for (int i = start; i < end ; i++) {
			if (arr[i] <= pivot) {
				// swap
				int temp = arr[pIndex];
				arr[pIndex] = arr[i];
				arr[i] = temp;
				pIndex++;

			}
		}

		int temp = arr[pIndex];
		arr[pIndex] = arr[end];
		arr[end] = temp;
		
		return pIndex;

	}

}
