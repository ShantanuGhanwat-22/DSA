package com.demo.Beans;



public class EmpSLL {
	private Emp e;
	private Node head;
	class Node{
		int n;
		Node nxt;
		Node(int e){
			n =e;
			nxt = null;
		}
	}
	
	public EmpSLL() {
		head = null;
	}
	
	public void AddbyPostn (int val, int pos) {
		Node new2 = new Node(val);
		if(head == null) {
			System.out.println("Empty List");
		}
		if(pos==1) {
			if(head==null) {
				head = new2;
			}
			else {
				new2.nxt = head;
				head = new2;
			}
		}
		else {
			Node back = head;
			for(int i = 1; back!=null && i <=pos-2 ;i+=1) {
				back = back.nxt;
			}
			if(back!=null) {
				new2.nxt = back.nxt;
			}
			else {
				System.out.println("Wrng postn");
			}
		}
	}
	
	public boolean DeletebyVal(int val) {
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			if(head.n == val) {
				Node temp = head;
				head = head.nxt;
				temp.nxt = null;
				return true;
			}
			else {
				Node back = head;
				Node current = back.nxt;
				while(current!=null && current.n!=val) {
					back = back.nxt;
					current = current.nxt;
				}
				if(current!=null) {
					back.nxt = current.nxt;
					current.nxt = null;
					return true;
				}
				else {
					System.out.println(val + "Not Found");
					return false;
				}
			}
		}
		return false;
	}
	
	public int Searchid(int val) {
		Node temp = head;
		int pos =0;
		if(head==null) {
			return -1;
		}
		else {
			while(temp!=null) {
				if(temp.n == val) {
					return pos++;
				}
				temp = temp.nxt;
			}
		}
		return -1;
	}
}
