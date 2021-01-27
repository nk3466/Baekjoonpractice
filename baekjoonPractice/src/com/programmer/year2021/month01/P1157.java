package com.programmer.year2021.month01;

import java.util.Scanner;

public class P1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String abc = sc.nextLine().toUpperCase();
		int arr[] = new int[26];
		int max = 0;
		int ind = 0;
		int count = 0;
		
		for(int i = 0; i < abc.length(); i++) {
			if(abc.charAt(i) >= 65 && abc.charAt(i) <= 90) {
				arr[((int)abc.charAt(i))-65] ++;
			}
		}
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] > max) {
				max = arr[j];
				ind = j;
			}
		}
		for(int o = 0; o < arr.length; o++) {
			if(arr[o] == max) {
				count++;
			}
		}
		if(count == 1) {
			System.out.println((char)(ind + 65));
		}else {
			System.out.println("?");
		}
			
	}

}
