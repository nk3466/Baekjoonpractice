package com.programmer.year2021.month03;

import java.util.Scanner;

public class P2231 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = 0;
		
		for(int i = 0; i < a; i++) {	//1부터 입력받은 값까지 대입해보기
			int number = i;
			int sum = 0;
			
			while(number != 0) {
				sum += number % 10; // 각 자리수 더하기
				number = number / 10;  //number /= 10 으로도 표현 가능
				
			}
			if( sum + i == a) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}

}
