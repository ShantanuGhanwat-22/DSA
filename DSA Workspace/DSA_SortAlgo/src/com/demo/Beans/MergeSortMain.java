package com.demo.Beans;

import java.util.Arrays;

public class MergeSortMain {
public static void main (String[] args) {
	int[] a = {65,35,26,13,23,12,91};
	System.out.println("Given Array "+Arrays.toString(a));
	MergeSort(a,0,a.length-1);
	System.out.println("Sorted Array "+Arrays.toString(a));
}

private static void MergeSort(int[] a, int s, int e) {
	// TODO Auto-generated method stub
	if(s<e) {
		int mid = (s+e)/2;
		MergeSort(a,s,mid);
		MergeSort(a,mid+1,e);
		merge(a,s,e,mid);
	}
}

private static void merge(int[] a, int s, int e, int mid) {
	// TODO Auto-generated method stub
	int i,j,k;
	int l1 = mid-s+1;
	int l2 = e-mid;
	
	int[] la=new int[l1];
	int[] ra=new int[l2];
	for(i=0;i<l1;i+=1) {
		la[i]=a[s+i];
	}
	for(j=0;j<l2;j+=1) {
		ra[j]=a[mid+1+j];
	}
	i=0;j=0;
	k=s;
	while(i<l1 && j<l2) {
		if(la[i]<ra[j]) {
			a[k] = la[i];
			k++;i++;
		}
		else {
			a[k]=ra[j];
			j++;k++;
		}
		while(i<l1) {
			a[k]=la[i];
			i++;k++;
		}
		while(j<l2) {
			a[k]=ra[j];
			j++;k++;
		}
		System.out.println("Start "+s+" End "+e+" Mid "+mid);
		System.out.println(Arrays.toString(a));
	}
}

}
