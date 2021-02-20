package com.programmer.year2021.month02;

import java.util.Scanner;

public class P9020 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();				//갯수 입력받기
		int q = 0;
		int w = 0;
		
		
		for(int i = 0; i < T; i++) {
			int a = sc.nextInt();
			for(q = a/2, w = a/2;;q++, w-- ) {		//반으로 나눠서 하나는 1씩 커지고 하나는 1씩 작아지면서 소수인지 체크
			
				a = q + w;
				if(check(q) && check(w)) {
					System.out.println(w + " " + q);
					
					break;
				}
				
			}
		}
	}

		public static boolean check(int ch) {			// 소수만 true 반환
		
		for(int i = 2; i < ch; i++) {
			if(ch % i == 0) {
				return false;
			}
		}
		return true;
	}

}
