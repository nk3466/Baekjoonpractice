package com.programmer.year2021.month04;

import java.util.Scanner;

public class P14501 {
//
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int T = 0;
		int P = 0;
		
		int arr[][] = new int[N + 10][2];
		for(int i = 0; i < N; i++) {
			arr[i+1][0] = sc.nextInt();		//시간 
			arr[i+1][1] = sc.nextInt();		//돈
		}
		int a[] = new int[N+10];	//최대 수익
		
		for(int i = 0; i < N; i++) {	//
			if(i + arr[i+1][0] <= N) { //시간 범위가 넘지 않은 경우 이전 수익과 이번 수익 비교
				a[i + arr[i+1][0]] = Math.max(a[i+ arr[i+1][0]],a[i] + arr[i+1][1]);
			}
			a[i+1] = Math.max(a[i], a[i+1]);
		}
		System.out.println(a[N]);
	}

}
