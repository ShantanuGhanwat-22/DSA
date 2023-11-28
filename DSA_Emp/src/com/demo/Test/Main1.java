package com.demo.Test;

import java.util.Scanner;

import com.demo.Service.ServIf;
import com.demo.Service.ServImpl;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServIf sf = new ServImpl();
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		do {
			System.out.println("1. AddEmp \n 2. DelEmp \n 3. Searchid \n");
			ch = 0;
			switch(ch) {
			case 1: sf.addEmp();
					break;
			case 2:
					break;
			}
		}while(ch!=5);
	}

}
