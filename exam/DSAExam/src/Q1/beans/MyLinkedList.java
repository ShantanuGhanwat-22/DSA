package Q1.beans;

public class MyLinkedList {
	Node head;
	Node tail;
	int size=0;
	
	//Inner Node Class 
	class Node{
		String data;
		Node next;
		
		//Parameterized Constructor
		Node(String data){
			this.data=data;
			this.next=null;
		}
	}
		
		//Q1. a) Insert Elements in Queue (From the Tail)
		public void enqueue(String data) {
			Node newNode = new Node(data);
			
			//If Queue is Full
			if(isFull()) {
				System.out.println("Queue Full");
				return;
			}
			//If Queue is Empty
			if(isEmpty()) {
				head=tail=newNode;
				size++;
				return;
			}
			
			//Adding Element to the tail
			newNode.next = tail;
			tail = newNode;
			size++;
		}
		
		//Q2. b) Remove elements from Queue
		public String dequeue() {
			
			//If queue is empty
			if(isEmpty()) {
				System.out.println("Queue Empty");
				return null;
			}
			
			//If queue has only one element
			if(head.next==null) {
				String temp= head.data;
				head=null;
				size--;
				return temp;
			}
			
			//Removing Element from the front
			String temp = head.data;
			head = head.next;
			size--;
			return temp;
		}
		
		
		//Q3. c) Print Elements of queue
		public void display() {
			int count=0;
			Node newNode = head;
			while(newNode!=null) {
				System.out.print(newNode.data+" -> ");
				count++;
				newNode=newNode.next;
			}
			System.out.println("null");
			System.out.println("Length of the queue is "+ count);
		}
		
		//Q4. d) If Queue if Full
		public boolean isFull() {
				return size>=10;
		}
		
		//Q5. e)If Queue is Empty
		public boolean isEmpty() {
			return head==null;
		}
		
		//Get Length Function
		public void getLength() {
			System.out.println("Length is: "+size);
		}
		
		
	}

