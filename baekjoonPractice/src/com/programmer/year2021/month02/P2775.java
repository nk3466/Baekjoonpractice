package com.programmer.year2021.month02;

import java.util.Scanner;

public class P2775 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[15][15];	//범위가 1부터 14까지이지만 배열의 인덱스 때문에 범위를 넓혀주었다.
										//안그러면 indexBoundExecption 발생
		for(int i = 0; i < 15 ; i++) {	//0층과 1호에 각각 초기화 해주기
			arr[i][0] = 1;
			//System.out.println("arr[" + i + "][0]" + arr[i][0]);
			arr[0][i] = i+1;
			//System.out.println("arr[0][" + i + "]" + arr[0][i]);
		}

		for(int i = 1; i < 15; i++) {	//0층부터 시작하므로 범위를 15까지 주었음
			for(int j = 1; j < 14; j++) { //14호까지 존재
				arr[i][j] = arr[i-1][j] + arr[i][j-1];
			}
		}
		
		int T = sc.nextInt();
		for(int i = 0; i < T ; i ++) {	//출력
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(arr[k][n-1]);
		}
				
	}

}
