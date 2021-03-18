package com.programmer.year2021.month03;

import java.util.Scanner;

public class P2589 {

	public static Long[] A = new Long[101];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();		// 갯수 입력
		
		A[0] = 0L;
		A[1] = 1L;
		A[2] = 1L;
		A[3] = 1L;
		
		for(int i = 0; i < T; i++) {
			int N = sc.nextInt();
			System.out.println(function(N));		
		}
		
		
		
	}

	public static Long function(int N) {
		if(A[N] == null) {					//값이 없다면 
			A[N] = function(N-2) + function(N - 3);	//피보나치 수열에서 나온 함수 
		}
		return A[N];
	}
}
