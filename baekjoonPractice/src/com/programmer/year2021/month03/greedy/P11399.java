package com.programmer.year2021.month03.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class P11399 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		for(int j = 0; j < N; j++) {
			for(int i = 0; i <= j; i++) {
				
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}

}
