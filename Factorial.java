package com.java.practice;

import java.util.Scanner;

public class Factorial {

	public static long get_fact_recursive(int n){
		if(n == 0){
			return 1;
		}else{
			return n * get_fact_recursive(n -1);
		}
	}
	
	public static long get_fact_iterative(int n)
	{	long fact = 1;
		for(int i = 1; i <= n; i++){
			fact *= i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long startTime = System.nanoTime();
		
		
		System.out.println(get_fact_recursive(n));
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		System.out.println("Recursive took " + duration + " miliseconds");
		startTime = System.nanoTime();
		
		
		System.out.println(get_fact_recursive(n));
		endTime = System.nanoTime();

		duration = (endTime - startTime);
		System.out.println("Iterative took " + duration + " miliseconds");
	}

}
