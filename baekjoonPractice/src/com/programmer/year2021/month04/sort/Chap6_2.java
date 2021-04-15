package com.programmer.year2021.month04.sort;

public class Chap6_2 {

	public static void main(String[] args) {
		//스와프
		int arr[] = new int[2];
		
		int regist;
		arr[0] = 0;
		arr[1] = 1;
		
		regist = arr[0];
		arr[0] = arr[1];
		arr[1] = regist;
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
	}

}
