package com.demo.Beans;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] a = {65,35,26,13,23,12,91};
		int[] b = {78,89,45,56,12,23,10};
		int[] c = new int[a.length+b.length];
		System.out.println("Given Array "+Arrays.toString(a));
		System.out.println("Given Array "+Arrays.toString(b));
		Mergesort(a,b,c);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
	}
	

	private static void Mergesort(int[] a, int[] b, int[] c) {
		// TODO Auto-generated method stub
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;k++;
			}
			else {
				c[k]=b[j];
				j++;k++;
			}
		while(i<a.length) {
			c[k] = a[i];
			i++;k++;
		}
		while(j<b.length) {
			c[k] = b[j];
			j++;k++;
		}
		System.out.println(c.toString());
	  }
	}

	
}
