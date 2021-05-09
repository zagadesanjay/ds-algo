package com.sz.algo.sorting;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = {64,25,12,22,11}; 
		sortArray(arr);
		printArry(arr);
		
	}

	private static void sortArray(int[] arr) {
		
		int n = arr.length;
		
		for (int i = 0; i < n - 1; i++) {
			
			int min_indx = i;
			
			for (int j=i+1; j<n;j++) {
				if (arr [j] < arr [min_indx])
					min_indx=j;
			}
			
			// swap
			int temp = arr [i];
			arr [i] = arr [min_indx];
			arr [min_indx] = temp;
			
		}
	}
	
	private static void printArry(int []arr) {
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
