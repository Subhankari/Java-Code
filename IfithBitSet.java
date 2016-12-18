package com.java.practice;

import java.util.Scanner;

public class IfithBitSet {

	public static boolean IfBitSet(int x, int i){
		int count = 0;
		while(x > 0){
			if((count == i) && ((x % 2) == 1)){
				return true;
			}
			x = x / 2;
			count++;
		}
		return false;
		
	}
	
	public static boolean IfBitSetEfficient(int x,int i){
		int temp = 1 << i;
		if((x & temp) > 0){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i = in.nextInt();
		long startTime = System.currentTimeMillis();
		System.out.println(IfBitSet(n,i));
		long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
		
		startTime = System.currentTimeMillis();
		System.out.println(IfBitSetEfficient(n,i));
		endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
	}

}
