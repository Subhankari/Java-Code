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
		this.heap_type = "max";
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
	
	public void PercolateDown(int i){
		int l,r,max,tmp;
		l = leftChild(i);
		r = rightChild(i);
		if(l != -1 && this.array[l] > this.array[i]){
			max = l;
		}else{
			max = i;
		}
		if(r != -1 && this.array[r] > this.array[max]){
			max = r;
		}
		if(max != i){
			tmp = this.array[i];
			this.array[i] = this.array[max];
			this.array[max] = tmp;
		}
		PercolateDown(max);
	}
	
	public int deleteMax(){
		if(this.count == 0){
			return -1;
		}
		int res = this.array[0];
		this.array[0] = this.array[count - 1];
		this.count--;
		PercolateDown(0);
		return res;
	}
	
	public void insert(int ele){
		if(this.count == this.capacity){
			this.resizeHeap();
		}
		this.count++;
		int i = this.count - 1;
		while(i >= 0  && ele > this.array[(i-1)/2]){
			this.array[i] = this.array[(i-1)/2];
			i = (i - 1)/2;
		}
		this.array[i] = ele;
	}
	
	public void resizeHeap(){
		this.capacity = this.capacity * 2;
		int[] arr = new int[this.capacity];
		System.arraycopy(this.array, 0, arr, 0, this.count);
		this.array = arr;
		arr = null;
	}
	
	
}
