package com.programmer.year2021.month02;

import java.util.Scanner;

public class P2581 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();	//처음 받는 수
		int N = sc.nextInt();	//두번째로 받는 수
		int sum = 0;			//합계 초기화
		int min = 0;			// 최솟값 초기화
		
		for(int i = M; i <=N; i++) {
			int t = 0;			// count 값 초기화
			
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					t++;			// 1부터 M부터 N사이 수까지 나머지가 0이면 t에 카운트 up
					//System.out.println("j = "+ j);	//나누는 수 확인
					//System.out.println("t = " +t);	//확인용 확인
		
				}
			}
			if(t == 2) {		//약수가 2개이면 (1과 자기 자신)
				if(sum == 0) {	//첫번째 수 이면
					min = i;	//소수 첫번째 값으로 대입
					sum += i;	//합계 추가
				}else {
					sum += i;	// 두번째 이상이면 합계만 추가
				}
			}
			
		}
		if(sum == 0) {					//합계가 0이면 -> 소수가 없으면
			System.out.println(-1);		//-1 출력
		}else {
			System.out.println(sum);	// 합계 출력
			System.out.println(min);	// 최솟값 출력
		}
	}

}
