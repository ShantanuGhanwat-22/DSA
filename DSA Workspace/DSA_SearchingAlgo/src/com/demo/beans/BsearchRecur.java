package com.demo.beans;

import java.util.Scanner;

public class BsearchRecur {
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
	public static int Bsearchrecursive(int first, int last, int search, int[] arr) {
		// TODO Auto-generated method stub
		if(first>last)
			return -1;
		else {
			int mid = (first+last)/2;
			if(arr[mid]==search)
				return mid;
			else if(arr[mid]<search) {
				System.out.println(first+","+last+","+search);
				return Bsearchrecursive(mid+1,last,search,arr);
			}
			else {
				System.out.println(first+","+last+","+search);
				return Bsearchrecursive(first,mid-1,search,arr);
			}
	}
	}
public static void main(String[] args) {
	int n=6;
	int[] arr = new int[n];
	Scanner sc = new Scanner(System.in);
	seqsearch(arr);
	System.out.println("Enter no. for search ");
	int search = sc.nextInt();
	int p = Bsearchrecursive(0,arr.length-1,search,arr);
}

}

