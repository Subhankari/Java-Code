//package com.java.practice;

import java.util.Scanner;

public class Check_palindrome {
	
	public static boolean isPali(String str){
		for(int i = 0; i < str.length() / 2; i++){
			if(str.charAt(i) != str.charAt(str.length() - i - 1)){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(isPali(s));
	}

}
