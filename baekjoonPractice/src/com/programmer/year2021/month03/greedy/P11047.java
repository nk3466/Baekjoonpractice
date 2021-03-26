package com.programmer.year2021.month03.greedy;

import java.util.Scanner;

public class P11047 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int count = 0;
		int arr[] = new int[N];
		
		for(int i = 0;i < N;i++) {
			arr[i] = sc.nextInt();
		}

		
			for(int i = N-1; i >= 0; i--) {
				int check = 0;
				if(arr[i] <= K) {
					check = K / arr[i];
					count += check;
					K -= arr[i] * check;
				}
			}
			
		
		System.out.println(count);
	}

}
