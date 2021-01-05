package com.programmer.year2021.month01;

import java.util.Scanner;

public class P2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m >= 45) {
			System.out.print(h+ " ");
			System.out.println(m - 45);
		}if(m < 45) {
			if(h == 0) {
				System.out.print(23 + " ");
				System.out.println(m + 60 - 45);
				
			}else {
				System.out.print(h-1 + " ");
				System.out.println(m + 60 - 45);
			}
			
		}
	}

}
