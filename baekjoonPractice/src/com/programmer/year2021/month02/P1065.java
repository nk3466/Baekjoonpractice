package com.programmer.year2021.month02;

import java.util.Scanner;

public class P1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a < 100) {				//입력 받은 수가 100보다작으면 자신을 출력
			System.out.println(a);
		}else {
			
			if( a == 1000) {			//1000일 경우 등차수열이 아니므로 999 까지 확인
				System.out.println(check(999));
			}else {
				
			System.out.println(check(a));
			}
		}
	}
		
		
		  public static int check(int n) {
			  
		  int result = 99;				//100이상의 수가 들어오면 한수의 갯수는 최소 99개
		
		  for(int i = 100; i <= n; i++) {
		  int num1 = (i / 100); 		//백의 자리수
		  int num2 = (i / 10) % 10;		//십의 자리수
		  int num3 = i % 10;			//일의 자리수
		 
		  if((num1 - num2) == (num2 - num3)) { //자리수가 수열을 이루면
			 result++; 
			  } 
		  }
		  return result; 
		 
		  
		  }
	}


