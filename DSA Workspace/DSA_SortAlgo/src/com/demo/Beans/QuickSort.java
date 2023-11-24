package com.demo.Beans;

import java.util.Arrays;

public class QuickSort {
	public static void main (String[] args) {
		int[] a = {65,35,26,13,23,12,91};
		System.out.println("Given Array "+Arrays.toString(a));
		Quicksort(a,0,a.length-1);
		System.out.println("Sorted Array "+Arrays.toString(a));
	}

	private static void Quicksort(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end) {
			int p = partition(a,start,end);
			Quicksort(a,start,p-1);
			Quicksort(a,p+1,end);
		}
	}

	private static int partition(int[] a, int s, int e) {
		// TODO Auto-generated method stub
		
		int pivot = s;
		int i=s;
		int j = e;
		while(i<j) {
			while(i<e && a[i]<=a[pivot]) {
				i++;
			}
		
		while(j>pivot && a[j]>a[pivot]) {
			j--;
		}
		if(i<j) {
			int temp = a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			
		}
		}
		int temp = a[j];
		a[j] = a[pivot];
		a[pivot] = temp;
	
	return j;
	}
		
	
}
