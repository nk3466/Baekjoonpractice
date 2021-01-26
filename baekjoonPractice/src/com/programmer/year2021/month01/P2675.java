package com.programmer.year2021.month01;

import java.util.Scanner;

public class P2675 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			for(int o = 0; o < S.length(); o++) {
			for(int j = 0; j < R; j++){
				System.out.print(S.charAt(o));
			}
		}
		System.out.println();
	}

}
}