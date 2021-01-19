package com.programmer.year2021.month01;

import java.util.Scanner;

public class P1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double sub[] = new double[N];
		double max = 0;
		double sum = 0;

		
		for(int i = 0; i < N; i++) {
			sub[i]= sc.nextInt();
		}
		for(int j = 0; j < N; j++) {
			if(sub[j] > max) {
				max = sub[j];
			}
		}
		
		for(int s = 0; s < N; s++) {
			sum += sub[s];
		}
		
		System.out.println(sum/(N*max)*100);
		
	}

}
