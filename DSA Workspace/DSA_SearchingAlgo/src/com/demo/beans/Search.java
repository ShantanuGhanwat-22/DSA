package com.demo.beans;

import java.util.Scanner;

public class Search {
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
		
	public static void main(String[] args) {
		int n = 5;
		int[] arr = new int[n];
		Scanner sc = new Scanner(System.in);
		seqsearch(arr);
		System.out.println("Enter no. of search");
		int search = sc.nextInt();
		int p = linearSearch(arr,search);
		System.out.println(p);
			}
		
		
	}

