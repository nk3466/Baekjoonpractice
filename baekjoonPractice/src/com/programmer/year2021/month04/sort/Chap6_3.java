package com.programmer.year2021.month04.sort;

public class Chap6_3 {

	public static void main(String[] args) {
		
		int arr[] = {7,5,9,0,3,1,6,2,4,8};
		
		for(int i = 1; i < arr.length; i++) {
			int regist = 0;					//스와프 하기 위한 변수 초기화
			for(int j = i; j >= 1; j--) {
					if(arr[j]< arr[j-1]) {	//작다면 스와프
						regist = arr[j-1];
						arr[j-1] = arr[j];
						arr[j] = regist;
					}
			}
			
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
