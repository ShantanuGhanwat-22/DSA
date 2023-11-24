package com.demo.Beans;

import java.util.Arrays;

public class Bubblesort {
	private static void bubblesort(int[] a) {
		// TODO Auto-generated method stub
		int n = a.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					//if(a[j]>a[j+1]) {
						int temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					//}
				}
				System.out.println(Arrays.toString(a));
			}
		}
	}


	public static void main(String[] args) {
		int[] a = {65,35,26,13,23,12,91};
		System.out.println("Given Array "+Arrays.toString(a));
		bubblesort(a);
		System.out.println("Sorted Array "+Arrays.toString(a));
	}
}
	
