package com.demo.Beans;

import java.util.Arrays;

public class ModifiedBubblesort {
	private static void bubblesort(int[] a) {
		// TODO Auto-generated method stub
		int n = a.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					if(a[j]>a[j+1]) {
						int temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
				}
				System.out.println(Arrays.toString(a));
			}
		}
	}

	private static void modbubblesort(int[] a) {
		// TODO Auto-generated method stub
		int n = a.length;
		boolean f;
		for(int i=0;i<n;i++) {
			f=false;
			for(int j=0;j<n-i-1;j++) {
		//swap the number
				if(a[j] >a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					f=true;
		}
	}
	System.out.println(Arrays.toString(a));
	if(!f) {
		break;
	}
			}
		}
		
		
	

	public static void main(String[] args) {
		int[] a = {65,35,26,13,23,12,91};
		System.out.println("Given Array "+Arrays.toString(a));
		modbubblesort(a);
		System.out.println("Sorted Array "+Arrays.toString(a));
		
	}
}

//	public static void main(String[] args) {
//		int[] arr= {65,35,26,13,23,12,91};
//		
//		System.out.println("Given array :");
//		System.out.println(Arrays.toString(arr));
//		//bubblesort(arr);
//		improvedBubbleSort(arr);
//		System.out.println("sorted Array : ");
//		System.out.println(Arrays.toString(arr));
//	}
//
//	private static void improvedBubbleSort(int[] arr) {
//		int n=arr.length;
//		boolean flag;
//		for(int i=0;i<n;i++) {
//			flag=false;
//			for(int j=0;j<n-i-1;j++) {
//				//swap the number
//				if(arr[j] >arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//					flag=true;
//				}
//			}
//			System.out.println(Arrays.toString(arr));
//			if(!flag) {
//				break;
//			}
//		}
//		
//	}
//
//	
//	//sort the data into ascending order
//	private static void bubblesort(int[] arr) {
//		int n=arr.length;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n-i-1;j++) {
//				//swap the number to move the bigger element on the right side
//				//if you change > to < sign then the sorting will happen in 
//				//descending order
//				if(arr[j] >arr[j+1]) {
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//			System.out.println(Arrays.toString(arr));
//		}
//		
//	}
//
//	
//}
	
