package com.programmer.year2021.month04;

import java.util.Scanner;

public class P11050 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();

		System.out.println(fun(N)/(fun(K) * fun(N-K)));
		
	}
	static int fun(int N) {
		int num = 1;
		for(int i = N; i >= 1; i--) {
			num *= i;
		}
		return num;
	}

}
