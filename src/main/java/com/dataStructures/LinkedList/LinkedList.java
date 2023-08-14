package com.dataStructures.LinkedList;

public class LinkedList {

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	private Node head;
	private Node tail;
	private int length;

	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void getHead() {
		System.out.println("Head:" + head.value);
	}
	
	public void getTail() {
		System.out.println("Tail:" + tail.value);
	}
	public void getLength() {
		System.out.print("Length:" + length);
	}

	public void append(int value) {
		Node newnode = new Node(value);
		if (head == null) {

			head = newnode;
			tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
			tail.next = null;
		}
		length++;
	}
	public Node removeLast() {
		Node temp=head;
		Node pre=head;
		if(length==0)
			return null;
		while(temp.next!=null) {
			pre=temp;
			temp=temp.next;
		}
		tail=pre;
		tail.next=null;
		length--;
		if(length==0) {
			head=null;
			tail=null;
		}
		return temp;
	}
	
}
