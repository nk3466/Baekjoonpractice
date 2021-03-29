package com.programmer.year2021.month03.implement;

import java.util.Scanner;

public class Chap4_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		
		for(int H = 0; H <= N; H++) {				//입력 받은 시간 까지
			for(int M = 0; M <= 59; M++) {			//시간이 흐를 때 
				for(int S = 0; S <= 59; S++) {
					if(Integer.toString(H).contains("3") || Integer.toString(M).contains("3") || Integer.toString(S).contains("3")) {	//각 시간에 3이 포함되어있으면 
						count++;					//count 증가
					}
				}
			}
		}
		System.out.println(count);
		
	}

}
