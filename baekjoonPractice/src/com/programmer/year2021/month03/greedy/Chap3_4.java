package com.programmer.year2021.month03.greedy;

import java.util.Scanner;

public class Chap3_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int count = 0;
		while(N >= 1) {

			if(N % K == 0) {	//나누어 떨어지면 
				N = N / K;		//나누기
				count++;		//횟수 추가
			}else {				//나누어 떨어지지 않으면
				N -= 1;			//1씩빼기(나누어 떨어질 때 까지)
				count++;		//횟수 추가
			}
			if(N == 1) {
				break;
			}
		}
		System.out.println(count);

	}

}
