package com.programmer.year2021.month01;

import java.util.Scanner;

public class P1152 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String abc = sc.nextLine().trim();
		int count = 0;
		
		for(int i = 0; i< abc.length(); i++) {
			if(abc.charAt(i) == ' ') {
				count++;
			}
		}
		if(abc.isEmpty()) {
			System.out.println('0');
		}else {
		System.out.println(count + 1);
	}
	}

}
