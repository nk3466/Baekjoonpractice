package com.programmer.year2021.month01;

import java.util.Scanner;

public class P3052 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int count = 0;
		int a = 0;
		
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		for(int j = 0; j < 10; j++) {
			for(int s = 0; s < j; s++) {
				if(arr[s] != arr[j]) {
					a = 1;
				}else {
					a = 0;
				}
			}
			count += a;
		}
			System.out.println(count + 1);
		
	}

}
