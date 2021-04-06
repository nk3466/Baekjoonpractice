package com.programmer.year2021.month04.DFS_BFS;

public class Chap5_5 {

	public static void main(String[] args) {

		
		System.out.println("반북문 : " + factorial(5));
		System.out.println("재귀 : " + factorial1(5));
	}

	public static int factorial(int n) {
		int result = 1;
		
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static int factorial1(int n) {
		
		if(n < 1) {
			return 1;
			
		}else {
			
			return n * factorial1(n-1);
		}
	}
}
