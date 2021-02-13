package com.programmer.year2021.month02;

import java.util.Scanner;

public class P1978 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int t = 0;
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if(a != 1) {
				for(int j = 1; j < a; j++) {
				if(a % j != 0) {
					t = 1;
				}
				
			}
				
		}
			count += t;
	}
		System.out.println(count);
	}

}
