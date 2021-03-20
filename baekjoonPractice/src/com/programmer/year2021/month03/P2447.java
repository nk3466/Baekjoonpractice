package com.programmer.year2021.month03;

import java.util.Scanner;

public class P2447 {
	static char[][] arr;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		arr = new char[N][N];
		
		star(0,0,N,false);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				sb.append(arr[i][j]);//sb에 담아서
			}
			sb.append('\n');
		}
		System.out.println(sb);//한번에 출력
		
	}
	static void star(int x, int y, int N, boolean blank) {
		// 공백일 경우
		if(blank = true) {
			for(int i = x; i < x + N; i++) {
				for(int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		//이부분이 이해가 안됨 왜 N == 1일 때 *인가!
		if(N == 1) {
			arr[x][y] = '*';
			return;
		}
		
		int size = N / 3;
		int count = 0;
		for(int i = x; i < x + N; i += size) {
			for(int j = y; j < j + N; j += size) {
				count++;
				if(count == 5) {// 공백인 경우
					star (i,j,size,true);
				}else {
					star(i, j, size, false);
				}
			}
		}
	}

}
