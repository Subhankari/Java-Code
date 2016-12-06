package com.java.practice;

import java.util.ArrayList;
/*
 * methods: get, set,add,size - O(1)
 * add(index,newvalue) - O(size - index)
 * 
 * Write a program to implement your own ArrayList class. It should 
 * contain add(), get(), remove(), size() methods. Use dynamic array logic.
 * It should increase its size when it reaches threshold.
 * 
 */
import java.util.Arrays;
import java.util.List;

public class MyArrayList {
	private Object[] myStore;
	private int actSize = 0;
	private int currentSize = 10;

	public MyArrayList(){
		myStore = new Object[10];
	}

	public MyArrayList(int n){
		myStore = new Object[n];
	}

	//define get
	public Object get(int index){
		if(index >= actSize || index < 0){
			throw new ArrayIndexOutOfBoundsException();	
		}
		return myStore[index];
	}

	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		int i = 0;
		int len = a.size();
		ArrayList<Integer> result = new ArrayList<Integer>();
		while(i < len){

			ArrayList<Integer> tmp = a.get(i);
			if((i % 2) == 0){
				for(int j = tmp.size() - 1; j >= 0;j--){
					result.add(tmp.get(j));
				}
			}
			else{
				for(int j = 0; j < tmp.size();j++){
					result.add(tmp.get(j));
				}

			}

		}



		
		// Populate result;
		return result;
	}

	//define set
	public void set(int index,Object new_val){
		if(index >= actSize || index < 0){
			throw new ArrayIndexOutOfBoundsException();	
		}
		myStore[index] = new_val;
	}
	// define add - add to the end, add at a position

	public void add(Object new_val){
		if(actSize > currentSize/2){
			increase_array_length();
		}
		myStore[actSize++] = new_val;
	}

	public void add(int Index, Object new_val){
		if(Index > actSize || Index < 0){
			throw new ArrayIndexOutOfBoundsException();	
		}
		if(Index == actSize){
			myStore[actSize++] = new_val;
		}else{
			for(int i = Index; i < actSize; i++){
				myStore[i + 1] = myStore[i];
			}
			myStore[Index] = new_val;
		}

	}

	//define remove
	public Object remove(int Index){
		if(Index > actSize || Index < 0){
			throw new ArrayIndexOutOfBoundsException();	
		}
		Object obj = myStore[Index];

		for(int i = Index + 1; i < actSize; i++){
			myStore[i - 1] = myStore[i];
		}
		myStore[actSize - 1] = null;
		actSize--;
		return obj;
	}
	public int size(){
		return actSize;
	}


	public void increase_array_length(){
		currentSize = myStore.length * 2;
		myStore = Arrays.copyOf(myStore, myStore.length * 2);
		System.out.println("\nNew length: "+myStore.length);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList mal = new MyArrayList();
		mal.add(new Integer(2));
		mal.add(new Integer(5));
		mal.add(new Integer(1));
		mal.add(new Integer(23));
		mal.add(new Integer(14));
		for(int i=0;i<mal.size();i++){
			System.out.print(mal.get(i)+" ");
		}
		mal.add(new Integer(29));
		System.out.println("Element at Index 5:"+mal.get(5));
		System.out.println("List size: "+mal.size());
		System.out.println("Removing element at index 2: "+ mal.remove(2));
		for(int i=0;i<mal.size();i++){
			System.out.print(mal.get(i)+" ");
		}

	}

}
