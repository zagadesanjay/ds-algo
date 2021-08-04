package com.sz.algo.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 54, 32, 0, 6, 78 };
		
		sort(arr, arr.length);
		
		for(int a : arr) {
			System.out.print(a + " ") ;
		}
	}

	private static void sort(int arr[], int n) {

		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int l[] = new int[mid];

		for (int i = 0; i < mid; i++) {
			l[i] = arr[i];
		}

		int r[] = new int[n - mid];
		
		for(int i = mid; i<n; i++) {
			r[i-mid] = arr[i];
		}

		sort(l, mid);
		sort(r, n - mid);
		merge(arr, l, r);

	}

	private static void merge(int arr[], int l[], int r[]) {
		int i = 0, j = 0, k=0;
		while (i < l.length && j < r.length) {
			if(l[i] <= r[j]) {
				arr[k++] = l[i++];
			}else {
				arr[k++]= r[j++];
			}
		}
		while(i < l.length) {
			arr[k++] = l[i++];
		}
		while(j < r.length) {
			arr[k++] = r[j++];
		}

	}

}
