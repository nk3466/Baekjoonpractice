package com.programmer.year2021.month01;

import java.util.Scanner;

public class P11720 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = sc.next();
		
		int sum = 0;
		
		for(int i = 0; i < a; i++) {
			sum += (int)(b.charAt(i)) - 48;
		}
		System.out.println(sum);
	}

}
