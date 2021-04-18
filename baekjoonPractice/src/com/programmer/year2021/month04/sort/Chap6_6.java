package com.programmer.year2021.month04.sort;

public class Chap6_6 {

	
	public static void main(String[] args) {

		int arr[] = new int[10];		//0부터 9까지를 저장해주기 위해 크기가 10인 배열 준비!
		int a[] = {7, 5, 9, 3, 0, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};		
		
		for(int i = 0; i < a.length; i++) {		//a 배열에 있는 값 만큼 count해주기
			arr[a[i]] += 1;
		}
		
		for(int i = 0; i < arr.length; i++) {		//a에 값만큼 출력해주기
			for(int j = 0; j < arr[i]; j++) {
				System.out.print(i + " ");
			}
		}
		
		
	}

}
