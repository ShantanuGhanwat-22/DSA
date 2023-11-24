package com.demo.Beans;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a = {65,35,26,13,23,12,91};
		System.out.println("Given Array "+Arrays.toString(a));
		Insertionsort(a);
		System.out.println("Sorted Array "+Arrays.toString(a));
		
	}

	public static void Insertionsort(int[] a) {
		// TODO Auto-generated method stub
		int n=a.length;
		for(int i=1;i<n;i++) {
			int k = a[i];
			int j = i-1;
			for(;j>=0 && a[j]>k ; j--) {
				a[j+1]=a[j];
			}
			a[j+1]=k;
          System.out.println(Arrays.toString(a));
		}
	}
}
