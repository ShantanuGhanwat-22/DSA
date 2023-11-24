package com.demo.Beans;

import java.util.Arrays;

public class HeapSort {
	public static void main(String[] args) {
	int[] a = {65,35,26,13,23,12,91};
	System.out.println("Given Array "+Arrays.toString(a));
	Heapsort(a);
	System.out.println("Sorted Array "+Arrays.toString(a));
	}

	private static void Heapsort(int[] a) {
		// TODO Auto-generated method stub
		int n = a.length;
		for(int i = n/2-1;i>=0;i--) {
			heapify(a,n,i);
		}
		System.out.println(Arrays.toString(a));
		
		for(int i =n-1 ;i>=0;i--) {
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			heapify(a,i,0);
			System.out.println("Size "+i);
			System.out.println(Arrays.toString(a));
		}
	}

	private static void heapify(int[] a, int n, int i) {
		// TODO Auto-generated method stub
		int largest = i;
		int l = (2*i)+1;
		int r =(2*i)+2;
		if(l<n && a[l]>a[largest]) {
			largest = l;
		}
		if (r<n && a[r]>a[largest]) {
			largest = r;
		}
		if (largest!=i) {
			int temp = a[largest];
			a[largest]=a[i];
			a[i]=temp;
			heapify(a,n,largest);
		}
	}
}
