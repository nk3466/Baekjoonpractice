package com.programmer.year2021.month02;

import java.util.Scanner;

public class P1978 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int t = 0;
			
				for(int j = 1; j <= a; j++) {
				if(a % j == 0) {	//나머지가 0이면
					t++;	//확인용 더하기
					//System.out.println("j = "+ j);	//나누는 수 확인
					//System.out.println("t = " +t);	//확인용 확인
			}
				
		}
				if(t == 2) {	// 나눠지는 수가 자기자신과 1뿐인 수라면
					
					count++;	//세자!
				}
	}
		System.out.println(count);
	}

}
