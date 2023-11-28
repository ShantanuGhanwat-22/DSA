package com.demo.Service;

import java.util.Scanner;

import com.demo.Beans.Emp;
import com.demo.Dao.DaoIf;
import com.demo.Dao.DaoImpl;

public class ServImpl implements ServIf {
	private DaoIf Dao;
	public ServImpl() {
		Dao = new DaoImpl();
	}
	
	@Override
	public void addEmp() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter Sal");
		double sal = sc.nextDouble();
		Emp e = null;
		Dao.save(e);
	}
}
