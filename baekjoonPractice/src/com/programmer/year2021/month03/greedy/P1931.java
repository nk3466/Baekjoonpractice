package com.programmer.year2021.month03.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class P1931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] times = new int[N][2]; // 시작 시간과 끝나는 시간을 위해서 2개 
		
		int min = -1;
		for(int i = 0; i < N; i++) {
			times[i][0] = sc.nextInt();
			times[i][1] = sc.nextInt();
		}
		
		Arrays.sort(times, (a,b) -> a[1] == b[1]? a[0] - b[0] : a[1] - b[1]);
		int cnt = 0; 
		for(int i = 0; i < N; i++) {
			if(times[i][0] >= min) {
				min = times[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);

	}
}
