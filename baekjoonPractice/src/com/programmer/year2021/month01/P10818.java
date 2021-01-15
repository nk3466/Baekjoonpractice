package com.programmer.year2021.month01;

import java.util.Scanner;

public class P10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int min = 1000000;
		int max = -100000;
		
		int[] arr = new int[a];
		
		for(int j = 0; j < a; j++) {
			arr[j] = sc.nextInt();
		}
		
		for(int i = 0; i < a; i++) {
			
			if(arr[i] > max) {

				max = arr[i];
			}else if(arr[i] < min) {
				min = arr[i];

			}
		
	}
		System.out.println(min + " " + max);
		sc.close();
	}
}


