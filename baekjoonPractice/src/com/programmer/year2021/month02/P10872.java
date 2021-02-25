package com.programmer.year2021.month02;

import java.util.Scanner;

public class P10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = 1;
		if(a == 0) {						//입력받은 값이 0 이면 1 출력
			System.out.println(1);
		}else {
											//아니면 메소드 factorial 을 실행시켜서 리턴값 출력
		System.out.println(factorial(a));	
		}
				
	}
	
	public static int factorial(int r) {		
		if(r <= 1) {						// 입력받은 값이 1보다 작거나 같을때까지
			return r;
		}else {
		return factorial(r-1) * r; 			// 입력받은 값부터 1씩 작아지면서 곱하기
	}

}
}
