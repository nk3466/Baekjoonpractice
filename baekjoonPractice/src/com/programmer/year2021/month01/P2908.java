package com.programmer.year2021.month01;

import java.util.Scanner;

public class P2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int A = ((a%10) * 100) + (int)Math.floor((a%100)/10)*10 + (int)Math.floor(a/100);
		int B = ((b%10) * 100) + (int)Math.floor((b%100)/10)*10 + (int)Math.floor(b/100);
		
		if(A>B) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
	}
	

}
