package com.demo.test;

import java.util.Scanner;

public class Test {
	public static int LinearSearch(int[] arr,int search) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				return i;
			}
		}
		return -1;
		
	}
	public static int BinarySearch(int[] arr, int search) {
		int first=0;
		int last=arr.length;
		while(first<=last) {
			int mid=(first+last)/2;
			if(arr[mid]==search) {
				return mid;
			}
			else if(arr[mid]<search) {
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
		}
		return -1;
	}
	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []arr=new int[5];
		acceptData(arr);
		System.out.println("Enter the no for search");
		int search=sc.nextInt();
		//System.out.println("The "+search+" found at "+LinearSearch(arr,search));
		System.out.println("The "+search+" found at "+BinarySearch(arr,search));
	}
	
	
}
