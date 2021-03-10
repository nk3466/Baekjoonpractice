package com.programmer.year2021.month03;

import java.util.Scanner;

public class ect1 {

	//1이 될 때까지 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// N,K를 공백을 기준으로 구분하여 입력받기
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;

		while(N >= 1) {
		if(N % K == 0) {
			N = N / K;
			count++;
		}else {
			N = N -1;
			count++;
		}
		}
		System.out.println(count);
	}

}
