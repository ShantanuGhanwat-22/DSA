package com.demo.Beans;

import java.util.Arrays;

public class Selectionsort {
	public static void main(String[] args) {
		int[] a = {65,35,26,13,23,12,91};
		System.out.println("Given Array "+Arrays.toString(a));
		SelectionSort(a);
		System.out.println("Sorted Array "+Arrays.toString(a));
		System.out.println(Arrays.toString(a));
	}

	private static void SelectionSort(int[] a) {
		// TODO Auto-generated method stub
		int n = a.length;
		for(int i=0;i<n-1;i++) {
			int min_index = i;
			for(int j = i+1;j<n;j++) {
				if(a[j]<a[min_index]) {
					min_index=j;
				}
			}
			int temp = a[i];
			a[i]=a[min_index];
			a[min_index]=temp;
		}
	}
}
