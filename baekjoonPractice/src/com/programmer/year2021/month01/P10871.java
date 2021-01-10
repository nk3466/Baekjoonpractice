package com.programmer.year2021.month01;

import java.util.Scanner;

public class P10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int [N];
		
		for(int j = 0; j < N; j++) {
			A[j] = sc.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			if(A[i] < X) {
				System.out.print(A[i] + " ");
			}
		}
	}

}
