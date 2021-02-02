package com.programmer.year2021.month02;

import java.util.Scanner;

public class P1712 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		
		if(C <= B) {	// 가변비용이 수입 가격보다 크다면 손익분기점이 존재하지 않음
			System.out.println(-1);
		}else { // 만약아니라면 손익분기점은 고정비용 / 수입- 가변비용 + 1개의 개수를 팔았을때 발생
			System.out.println(A / (C - B) + 1);
		}
	}
}


