package com.demo.beans;

import java.util.Scanner;

public class Bsearch {
	public static void seqsearch(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i+=1) {
			System.out.println("enter no." +(i+1));
			arr[i] = sc.nextInt();
	}
}
	public static int linearSearch(int[] arr, int search) {
		for (int j = 0;j<arr.length;j+=1) {
			if(arr[j]==search)
				return j;
	}
		return -1;
	}
	public static int BinarySearch(int[] arr,int search) {
		int first = 0,last =arr.length-1;
		int cmp = 0;
		while(first<=last) {
			int mid = first/2 +last/2 ;
			cmp++;
			if(arr[mid] == search) {
				System.out.println("Comparisons done "+cmp);
				return mid;
			}
			else if(arr[mid]<search) {
				first = mid+1;
			}
			else {
				last = mid -1;
			}
		}
		System.out.println("Comparisons done "+cmp);
		return -1;
	}
public static void main(String[] args) {
	int n=6;
	int[] arr = new int[n];
	Scanner sc = new Scanner(System.in);
	seqsearch(arr);
	System.out.println("Enter no. for search ");
	int search = sc.nextInt();
	int p =BinarySearch(arr, search);
}
}
