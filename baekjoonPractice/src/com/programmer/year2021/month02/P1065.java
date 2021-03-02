package com.programmer.year2021.month02;

import java.util.Scanner;

public class P1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a < 100) {
			System.out.println(a);
		}else {
			
			int result = 99;
			
			for(int i = 100; i < a; ++i) {
				result += check(i);
			}
			
			if( a == 100) {
				result--;
				System.out.println(result);
			}
		}
		
		/*
		 * public int check(int n) { int num1 = n / 100 % 10; int num2 = n / 10 % 10;
		 * int num3 = n % 10;
		 * 
		 * if(num2 * 2 == num1 + 3) { return 1; } return 0; }
		 */

	}

}
