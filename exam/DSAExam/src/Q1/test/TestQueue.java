package Q1.test;

import java.util.Scanner;

import Q1.beans.MyLinkedList;

public class TestQueue {
	public static void main(String[] args) {
		
		MyLinkedList li = new MyLinkedList();
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter your choice");
		do{
			System.out.println("1. Insert Element in Queue");
			System.out.println("2. Remove Element from Queue");
			System.out.println("3. Print Queue");
			System.out.println("4. Is Queue Full?");
			System.out.println("5. Is Queue Empty?");
			System.out.println("Enter 0 to exit");
			System.out.println("Enter your choice");
			num = sc.nextInt();

			switch(num) {
			case 0:
				System.out.println("Exit code 0");
				return;
			case 1:
				System.out.println("Enter 10 Elements");
				for(int i=0;i<10;i++) {
					String data = sc.next();
					li.enqueue(data);
				}
				break;
				
			case 2:
				System.out.println("Removing 10 Elements");
				for(int i=0;i<10;i++) 
					System.out.println(li.dequeue());
				break;
				
			case 3:
				System.out.println("Elements in Queue are");
				li.display();
				break;
				
			case 4:
				System.out.println("Is Queue Full");
				li.isFull();
				break;
				
			case 5:
				System.out.println("Is Queue Empty");
				li.isEmpty();
				break;
				
			default:
				System.out.println("Invalid Option");
			}
		}while(num!=0);
		
		
		
		
		/*
		li.enqueue("Name :");
		li.enqueue("Omkar");
		li.enqueue("Santosh");
		li.enqueue("Ware");
		li.enqueue(" Age :");
		li.enqueue("22");
		li.enqueue("Work :");
		li.enqueue("Developer");
		li.enqueue("Thank You");
		
		
		li.enqueue("A");
		li.enqueue("B");
		li.enqueue("C");
		li.enqueue("D");
		li.enqueue("E");
		li.enqueue("F");
		li.enqueue("G");
		li.enqueue("H");
		li.enqueue("I");*/
		
		/*li.display();
		
		System.out.println(li.dequeue());
		li.getLength();
		
		System.out.println(li.dequeue());
		li.getLength();
		
		System.out.println(li.dequeue());
		li.getLength();
		
		System.out.println(li.dequeue());
		li.getLength();
		
		System.out.println(li.dequeue());
		li.getLength();
		
		System.out.println(li.dequeue());
		li.getLength();
		
		System.out.println(li.dequeue());
		li.getLength();
		
		System.out.println(li.dequeue());
		li.getLength();
		
		System.out.println(li.dequeue());
		li.getLength();
		
		System.out.println(li.dequeue());
		li.getLength();
		
		
		li.toString();*/
	}
}

