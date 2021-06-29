package com.programmer.year2021.month05;

import java.util.Scanner;

public class P1032 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		char[] chars = sc.next().toCharArray();
		
		for(int i = 1; i < a; i++) {
			String temp = sc.next();
			for(int j = 0; j < chars.length; j++) {
				if(chars[j] != temp.charAt(j)) {
					chars[j] = '?';
				}
			}
		}
		
		System.out.println(String.valueOf(chars));
	}

}
