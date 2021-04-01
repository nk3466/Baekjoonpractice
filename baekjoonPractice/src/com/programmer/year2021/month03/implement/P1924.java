package com.programmer.year2021.month03.implement;

import java.util.Scanner;

public class P1924 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int day = 0;
		
		for(int i = 1; i < x; i++) {				//월에 따라 일수를 더해줌(x 전월 까지 더해줌)
			if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				day += 31;
			}else if(i == 4 || i == 6 || i == 9 || i == 11) {
				day += 30;
			}else if(i == 2) {
				day += 28;
			}
		}
		day += y;			//x월의 일수 더해주기
		if(day % 7 == 1) {				//7로 나눈 나머지로 요일 파악하기
			System.out.println("MON");
		}else if(day % 7 == 2) {
			System.out.println("TUE");
		}else if(day % 7 == 3) {
			System.out.println("WED");
		}else if(day % 7 == 4) {
			System.out.println("THU");
		}else if(day % 7 == 5) {
			System.out.println("FRI");
		}else if(day % 7 == 6) {
			System.out.println("SAT");
		}else if(day % 7 == 0) {
			System.out.println("SUN");
		}
	}

}
