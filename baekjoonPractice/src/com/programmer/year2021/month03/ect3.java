package com.programmer.year2021.month03;

import java.util.Scanner;

public class ect3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		long result = 0;
		
		result = A.charAt(0) - '0'; //0을 문자로 표현한 것의 아스키코드 값 빼줌으로 
									//해당 첫번째 값의 숫자를 result에 대입
		
		for(int i = 0; i <A.length(); i++) {
			int num = A.charAt(i) -'0';
			
			if(num <= 1 || result <= 1) {
				result += num;
			}else {
				result *= num;
			}
		}
		System.out.println(result);
	}

}
