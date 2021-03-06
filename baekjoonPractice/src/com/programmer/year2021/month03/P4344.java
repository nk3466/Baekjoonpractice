package com.programmer.year2021.month03;

import java.util.Scanner;

public class P4344 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b, total, count;
		
		double avg;
		
		int score[] = new int[1000];
		
		for(int i = 0; i < a; i++) {
			b = sc.nextInt();
			total = 0;
			count = 0;
			for(int j = 0; j < b; j++) {
				score[j] = sc.nextInt();
				total += score[j];
			}
			avg = (double) total / b;
			
			for(int k = 0; k < b; k++) {
				if(score[k] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f", 100.0 * count / b);	//double 출력
			System.out.println("%");
		}
		sc.close();
	}
}
