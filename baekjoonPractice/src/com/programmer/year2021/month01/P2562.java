package com.programmer.year2021.month01;

import java.util.Scanner;

public class P2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int sum = 0;
		int arr[] = new int [9];
		
		for(int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int j = 0; j < 9; j++) {
			if(arr[j] > max) {
				max = arr[j];
			}
			sum++;
		}
		
		System.out.println(max);
		System.out.println(sum-1);
		
	}

}
