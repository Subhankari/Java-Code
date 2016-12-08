package com.java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class GenerateBinaryString {
	
	private static char[] A;
	
	public static void Binary(int n){
		if(n < 1){
			System.out.println(Arrays.toString(A));
		}else{
			A[n-1] = '0';
			Binary(n-1);
			A[n-1] = '1';
			Binary(n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the length of the string.");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		A = new char[n];
		long startTime = System.nanoTime();
		Binary(n);
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		System.out.println("Recursive took " + duration + " miliseconds");
		
	}

}
