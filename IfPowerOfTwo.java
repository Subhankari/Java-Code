package com.java.practice;
import java.util.*;
public class IfPowerOfTwo {

	public IfPowerOfTwo() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean isPowerOfTwo(int x){
		if(x == 0){
			return false;
		}else{
			while((x%2) == 0) x = x / 2;
			return(x == 1);
		}
	}
	
	public static boolean isPowerOfTwoEfficient(int x){
		return ((x > 0) && ((x & (x-1)) == 0));
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long startTime = System.currentTimeMillis();
		System.out.println(isPowerOfTwo(n));
		long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
		
		startTime = System.currentTimeMillis();
		System.out.println(isPowerOfTwoEfficient(n));
		endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
	}

}
