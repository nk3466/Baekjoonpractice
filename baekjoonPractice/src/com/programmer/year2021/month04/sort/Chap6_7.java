package com.programmer.year2021.month04.sort;

import java.util.Arrays;

public class Chap6_7 {

	public static void main(String[] args) {

		int arr[] = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]);
		}
	}

}
