package com.programmer.year2021.month02;

import java.util.Scanner;

public class P2292 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int count = 1;
		int term = 1;
		int range = 1;
		
		while(true) {
			if(range >= a) {
				break;
			}else {
				term = 6 * (count++);
				range += term;
			}
		}
		System.out.println(count);
	}

}
