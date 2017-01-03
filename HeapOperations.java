package com.java.practice;

public class HeapOperations {

	public HeapOperations() {
		// TODO Auto-generated constructor stub
	}
	public void BuildHeap(Heap h, int[] A, int n){
		if(h == null){
			return;
		}
		while(n > h.capacity){
			h.resizeHeap();
		}
		for(int i = 0; i < n; i++){
			h.array[i] = A[i];
		}
		h.count = n;
		for(int i = (n-1)/2 ; i >= 0; i--){
			h.PercolateDown(i);
		}
	}
	
	

}
