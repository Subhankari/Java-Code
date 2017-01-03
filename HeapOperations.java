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
	
	public int[] HeapSort(int[] A, int n){
		int[] res = new int[n];
		Heap h =  new Heap(n,"max");
		BuildHeap(h,A,n);
		int old_count = h.count;
		for(int i = 0; i < n; i++){
			res[i] = h.array[0];
			h.array[0] = h.array[h.count - 1];
			h.count--;
			h.PercolateDown(0);
		}
		return res;
	}
	

}
