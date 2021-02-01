package com.programmer.year2021.month02;

import java.util.Scanner;

public class P1316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		
		while(a--> 0) {
			String abc = sc.next();
			int[] arr = new int[26];
			count += 1;
			
			for(int j = 1; j < abc.length(); j++) {
				if(abc.charAt(j) != abc.charAt(j-1)) {
					arr[abc.charAt(j-1) - 97] = -1;
					if(arr[abc.charAt(j) -97] == -1) {
						count -= 1;
						break;
						
					}
				}
			}
		}
		System.out.println(count);
	}
	
}
