package com.programmer.year2021.month02;

import java.util.Scanner;

public class P2839 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = 0;
		
		if(a % 3 == 0 && a % 5 != 0) {
			result = a / 3;
		} else {
			
		
		result = a / 5;
		
		if(a % 5 == 3) {
			result += 1;
		}else {
			result = -1;
		}
		}
		
		System.out.println(result);
	}

}
