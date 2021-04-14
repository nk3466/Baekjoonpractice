package com.programmer.year2021.month04.sort;

import java.util.Scanner;

public class Chap6_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		
		int index = 0;		//min index 초기화
		int min = 0;		//최소값 초기화
		for(int i = 0; i < arr.length; i++) {
			index = i;							//작은 인덱스부터
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] <= arr[index]) {			//작은 인덱스보다 작으면
					index = j;						//그 인덱스 저장
				}
			}
			min = arr[index];						//저장한 인덱스에 해당하는 값을 저장
			arr[index] = arr[i];					//작은 인덱스의 값을 저장한 인덱스로 보내기
			arr[i] = min;							//맨 처음부터 작은 값 담기
		}

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
