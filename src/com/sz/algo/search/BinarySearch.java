package com.sz.algo.search;


/**
 * Time complexity O(logn)
 * @author Sanjay
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println(findRecursive(arr,5, 0,arr.length));
	}

	
	/**
	 *  Recursive 
	 *  
	 * @param arr
	 * @param x
	 * @param l
	 * @param r
	 * @return
	 */
	private static int findRecursive(int arr[], int x, int l, int r) {

		if (l <= r) {

			int mid = (l + r) / 2;

			if (x == arr[mid]) {
				return mid;
			}

			if (x > arr[mid])
				return findRecursive(arr, x, mid + 1, r);

			return findRecursive(arr, x, l, mid - 1);

		}

		return -1;

	}

	private static int find(int arr[], int x) {

		int l = 0;
		int r = arr.length - 1;

		while (l <= r) {
			int m = (l + r) / 2;

			if (arr[m] == x) {
				return m;
			} else if (x < arr[m]) {
				r = m - 1;
			} else {
				l = m + 1;
			}
		}

		return -1;
	}

}
