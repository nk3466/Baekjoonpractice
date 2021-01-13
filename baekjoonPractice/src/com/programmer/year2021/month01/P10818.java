package com.programmer.year2021.month01;

import java.util.Scanner;

public class P10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int min = -1000000;
		int max = 1000000;
				
		int[] iarr1 = new int[a];
		
		for(int j = 0; j < a; j++) {
			iarr1[j] = sc.nextInt();
		}
		
		for(int i = 0; i < a; i++) {
			if(iarr1[i] > max) {
				max = iarr1[i];
			}
			if(iarr1[i] < min) {
				min = iarr1[i];
			}
		
	}
		System.out.println(min + " " + max);
		sc.close();
	}
}


