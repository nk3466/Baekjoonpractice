package com.programmer.year2021.month04;

import java.util.Scanner;

public class P2579 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();

	        int[] stair = new int[301];
	        int[] score = new int[301];
	        
	        for (int i = 1; i <= N; i++) {
	        	stair[i] = sc.nextInt();
	        }

	        score[1] = stair[1];
	        score[2] = stair[1] + stair[2];
	        score[3] = Math.max(stair[1], stair[2]) + stair[3];		//앞 두개 계단중 점수가 높은것이랑 더하기

	        for (int n = 4; n <= N; n++) {
	            score[n] = Math.max(score[n - 3] + stair[n - 1], score[n - 2]) + stair[n];
	        }

	        System.out.println(score[N]);
	    }

}
