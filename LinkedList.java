package com.java.practice;

public class LinkedList {

	//Linked List ADT: Insert, Delete, Delete List, Count, Find Nth Node from end of the List
	public LinkedList(){
		length = 0;
	}
	ListNode head;
	private int length = 0;

	public synchronized ListNode getHead(){
		return head;
	}

	public synchronized void insertAtBegin(ListNode node){
		node.setNext(node);
		head = node;
		length++;
	}

	public synchronized void insertAtEnd(ListNode node){
		if(head == null){
			head = node;
		}else{
			ListNode curr = head;
			ListNode next = head.getNext();
			while(next != null){
				curr = next.getNext();
				next = curr.getNext();
			}
			/*
			ListNode curr,next;
			for(curr = head;(next = curr.getNext()) != null; curr = next);
				curr.setNext(node);
			*/
			curr.setNext(node);
		}
		length++;
	}
	
	public void insert(int data , int position){
		if(position < 0){
			position = 0;
		}
		if(position > length){
			position = length;
		}
		if(position == 0){
			if(head == null){
				head = new ListNode(data);
			}else{
				ListNode temp = new ListNode(data);
				temp.setNext(head);
				head = temp;
			}
		}else{
			ListNode prev = head;
			for(int i = 1; i < position; i++){
				prev = prev.getNext();
			}
			ListNode temp = new ListNode(data);
			temp.setNext(prev.getNext());
			prev.setNext(temp);			
		}
		length++;
	}
	public synchronized ListNode removeFromBegin(){
		ListNode temp = head;
		if(temp != null){
			head = head.getNext();
			temp.setNext(null);
			length--;
		}
		return temp;
		
	}
	public synchronized ListNode removeFromEnd(){
		if(head == null){
			return null;
		}
		ListNode p = head;
		if(p.getNext() == null){
			head = null;
			length--;
			return p;
		}
		ListNode q = null, next = p.getNext();
		while((next = p.getNext()) != null){
			q = p;
			p = next;
		}
		q.setNext(null);
		length--;
		return p;
	
	}
	public synchronized void removeMatched(ListNode node){
		if(head == null){
			return;
		}
		if(node.equals(head)){
			head = head.getNext();
			return;
		}
		ListNode p = head, q = null;
		while((q = p.getNext()) != null){
			if(node.equals(q)){
				p.setNext(q.getNext());
				return;
			}
			p = q;
		}
		
	}
	public void remove(int position){
		if(position < 0){
			position = 0;
		}
		if(position >= length){
			position = length - 1;
		}
		if(position == 0){
			ListNode node = head;
			head = head.getNext();
		}else{
			ListNode node = head;
			for(int i = 1; i < position ; i++){
				node = node.getNext();
			}
			node.setNext(node.getNext().getNext());
		}
	}
	public String toString(){
		String result = "[";
		if(head == null){
			return result + "]";
		}
		result = result + head.getData();
		ListNode temp = head.getNext();
		while(temp != null){
			result = result + "," + temp.getData();
			temp = temp.getNext();
		}
		return result + "]";
	}
	
	public int length(){
		return length;
	}
	public int getPosition(int data){
		ListNode node = head;
		int pos = 0;
		while(node != null){
			if(node.getData() == data){
				return pos;
			}
			node = node.getNext();
			pos++;
		}
		
		return Integer.MIN_VALUE;
	}
	public void clearList(){
		head = null;
		length = 0;
	}
}
