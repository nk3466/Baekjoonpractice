package com.programmer.year2021.month01;

import java.util.Scanner;

public class P8393 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int result = 0;
		
		for(int i = 0; i <= a; i++) {
			result += i;
		}
		
		System.out.println(result);
	}

}
