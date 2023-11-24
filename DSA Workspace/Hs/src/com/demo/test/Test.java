package com.demo.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test {
	public static void rmduplicate(int[] arr) {
		Set<Integer>hs=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		rmduplicate(arr);
	}

	
}
