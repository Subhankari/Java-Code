package com.java.practice;

public class Heap {
	public int[] array;
	public int count;
	public int capacity;
	public String heap_type;
	
	public Heap() {
		// TODO Auto-generated constructor stub
		this.capacity = 10;
		this.array = new int[capacity];
		this.count = 0;
		this.heap_type = "min";
	}
	public Heap(int capacity, String heap_type){
		this.capacity = capacity;
		this.array = new int[capacity];
		this.count = 0;
		this.heap_type = heap_type;
	}
	public int parent(int i){
		if(i <= 0 || i >= this.count){
			return -1;
		}
		return (i-1) / 2;
	}
	
	public int leftChild(int i){
		int leftChild = 2 * i + 1;
		if(i <= 0 || i > this.count){
			return -1;
		}
		return leftChild;
	}
	public int rightChild(int i){
		int rightChild = 2 * i + 2;
		if(i <= 0 || i > this.count){
			return -1;
		}
		return rightChild;
	}
	public int getMax(){
		if(this.count == 0){
			return -1;
		}
		return this.array[0];
	}
}
