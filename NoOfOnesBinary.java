package com.java.practice;
import java.util.*;

public class NoOfOnesBinary {

	
	public static int countOnes(int x){
		int count = 0;
		while(x > 0){
			if(x % 2 == 1){
				count++;
			}
			x = x / 2;
		}
		return count;
	}
	
	public static int countOnesEfficient(int x){
		int count = 0;
		while(x > 0){
			x = x & (x -1);
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long startTime = System.currentTimeMillis();
		System.out.println(countOnes(n));
		long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
		
		startTime = System.currentTimeMillis();
		System.out.println(countOnesEfficient(n));
		endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
	
		
	}
	

}
