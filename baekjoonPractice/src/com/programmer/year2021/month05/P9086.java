package com.programmer.year2021.month05;

import java.util.Scanner;

public class P9086 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0; i<T; i++) {
			String str = scan.next();
			System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));
		}
		
		scan.close();	

	}

}
