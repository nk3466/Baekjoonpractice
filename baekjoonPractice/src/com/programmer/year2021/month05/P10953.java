package com.programmer.year2021.month05;

import java.util.Scanner;

public class P10953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.nextLine());
		String arr[];
		
		for(int i = 0; i < a; i++) {
			arr = sc.nextLine().split(",");
			
			System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
			
			
		}
	}
}
