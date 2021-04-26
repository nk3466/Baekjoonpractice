package com.programmer.year2021.month04;

import java.util.Scanner;

public class P2167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[][] = new int [N+1][M+1];
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int K = sc.nextInt();
		for(int i = 0; i < K; i++) {
			int sum = 0;
			int x = sc.nextInt();
			int y = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			for(int h = x; h <= x2; h++) {
				for(int j = y; j <= y2; j++) {
					sum += arr[h][j];
				}
			}
			System.out.println(sum);
			
		}
	}

}
