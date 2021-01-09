package com.programmer.year2021.month01;

import java.util.Scanner;

public class P2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= (a-i); j++) {
				System.out.print(" ");
			}
			for(int s = 0 ; s < i ; s++ ) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
