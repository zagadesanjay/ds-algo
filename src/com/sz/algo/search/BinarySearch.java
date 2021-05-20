package com.sz.algo.search;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6}; 
		System.out.println(find(arr,1));
	}

	private static int find(int arr[], int x) {
		
		int l = 0;
		int r = arr.length -1;
		
		while(l <= r) {
			int m = (l + r)/2;
			
			if(arr[m] == x) {
				return m;
			}else if(x < arr[m]) {
				r = m-1;
			}else {
				l = m+1;
			}
		}
		
		return -1;
	}

}
