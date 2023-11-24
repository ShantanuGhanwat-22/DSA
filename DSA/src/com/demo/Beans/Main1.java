package com.demo.Beans;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        int choice = 0 ;
        do {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("1. Bubble Sort \n 2. Insertion Sort \n 3. Selection Sort \n  4. Merge Sort \n 5. Quick Sort \n 6. Heap Sort \n Your Choice");
        	choice = sc.nextInt();
        	Scanner s = new Scanner(System.in);
            System.out.println("Enter Array Length");
            int n = s.nextInt();
            int[] a = new int[n];
            acceptData(a);
        	switch(choice) {
        	case 1 : 
                System.out.println("Given Array "+Arrays.toString(a));
        		bubblesort(a);
        		//System.out.println(Arrays.toString(a));
        	
        	case 2:
        		System.out.println("Given Array "+Arrays.toString(a));
        		insertionsort(a); 
        		
        	case 3:
        		System.out.println("Given Array "+Arrays.toString(a));
        		selectionsort(a);
        		
        	case 4:
        		System.out.println("Given Array "+Arrays.toString(a));
        		mergesort(a,0,a.length-1);
        	
        	case 5:
        		System.out.println("Given Array "+Arrays.toString(a));
        		quicksort(a,0,a.length-1);
        	}	
        }while(choice!=7);
        
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
private static void quicksort(int[] a, int s, int e) {
		// TODO Auto-generated method stub
		if(s<e) {
			int p = separation(a,s,e);
			quicksort(a,s,p-1);
			quicksort(a,p+1,e);
		}
	}



private static int separation(int[] a, int first, int last) {
	// TODO Auto-generated method stub
	int pivot = first;
	int i = first;
	int j = last;
	while(i<j) {
		while(i<last && a[i]<=a[pivot]) {
			i++;
		}
		while(j>pivot && a[j]>a[pivot]) {
			j--;
		}
		if(i<j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			return i;
		}
		
	}
	int temp = a[j];
	a[j] = a[pivot];
	a[pivot] = temp;
	return j;
	
	//System.out.println("Sorted Array "+Arrays.toString(a));
	
}




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	private static void mergesort(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end) {
			int mid = (start+end)/2;
			mergesort(a,start,mid);
			mergesort(a,mid+1,end);
			merge(a,start,end,mid);
		}
	}
	private static void merge(int[] a, int start, int end, int mid) {
		// TODO Auto-generated method stub
		int i,j,k;
		int l = mid-start+1;
		int r = end - mid;
		int[] la = new int[l];
		int[] ra = new int[r];
		
		for(i=0;i<l;i++) {
			la[i]=a[start+i];
		}
		for(i=0;i<r;i++) {
			ra[i]=a[mid+1+i];
		}
		i=0;j=0;k=start;
		while(i<l && j<r) {
			if(la[i]<ra[j]) {
				a[k]=la[i];
				i++;k++;
			}
			else {
				a[k]=ra[j];
				j++;k++;
			}
		}
		while(i<l) {
			a[k]=la[i];
			i++;k++;
		}
		while(j<r) {
			a[k]=ra[j];
			j++;k++;
		}
		System.out.println("Start "+start+"End "+end+"Mid "+mid);
		System.out.println("Sorted Array "+Arrays.toString(a));
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private static void selectionsort(int[] a) {
		// TODO Auto-generated method stub
		int b =a.length;
		int iterations = 0;
		for(int i=0;i<b-1;i++) {
			int min_idx = 1;
			for(int j=1+1;j<b;j++) {
				if(a[j]<a[min_idx]) {
					min_idx=j;
				}
			}
			int temp = a[i];
			a[i]=a[min_idx];
			a[min_idx]=temp;
			iterations++;
			System.out.println("iterations "+iterations+" "+Arrays.toString(a));
		}
		System.out.println("Sorted Array " +Arrays.toString(a));
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private static void insertionsort(int[] a) {
		// TODO Auto-generated method stub
		int b = a.length;
		int iterations = 0;
		for(int i=1;i<b;i++) {
			int k = a[i];
			int j = i-1;
			for(;j>=0 && a[j]>k;j--) {
				a[j+1]=a[j];
			}
			a[j+1]=k;
			iterations++;
			System.out.println("iterations "+iterations+" "+Arrays.toString(a));
		}
		System.out.println("Sorted Array " +Arrays.toString(a));
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private static void bubblesort(int[] a) {
		// TODO Auto-generated method stub
		int b = a.length;
		boolean f;
		int iterations = 0;
		for(int i = 0;i<b;i++) {
			f=false;
			for(int j = 0 ; j<b-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
					f=true;	
				}
			}
			iterations++;
			System.out.println("Iterations "+iterations+" "+Arrays.toString(a));
			if(!f) {
				break;
			}
		}
		System.out.println("Sorted Array "+Arrays.toString(a));
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private static void acceptData(int[] a) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i<a.length;i+=1) {
			System.out.println("Enter number"+(i+1));
			a[i]=sc.nextInt();
		}
	}
}
