package com.programmer.year2021.month01;

import java.util.Scanner;

public class P10952 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0) {
				break;
			}else {
				System.out.println(a+b);
			}
		}
	}

}
