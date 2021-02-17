package com.programmer.year2021.month02;

import java.util.Scanner;

public class P11653 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
				
		while(N > 1 ) {
		for(int i = 2; i <= N; i++) {
			while(N % i == 0) {
					System.out.println(i);
					N = N/i;
				}
				
			}
		} 

}
}
