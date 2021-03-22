package com.programmer.year2021.month03.greedy;

import java.util.Scanner;

public class Chap3_1 {

	public static void main(String[] args) {
		/* 손님에게 거슬러 줘야 할 돈이 N원 일때 거슬러 줘야 할 동전의 최소 개수를 구하라.
		 * 단, 거슬러 줘야 할 돈 N은 항상 10의 배수이다. */
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//거슬러 줘야 할 돈
		int count = 0;			//동전 개수 초기화
		
		if(N > 500) {
			count += N / 500;	//거슬러 줘야할 동전의 갯수 추가
			N -= 500 * (N / 500);	//남은 돈계산
		}else if(N > 100) {
			count += N / 100;
			N -= 100 * (N / 100);
		}else if(N > 50) {
			count += N / 50;
			N -= 50 * (N / 50);
		}else {
			count += N / 10;
		}
		System.out.println(count);
		
	}
}
