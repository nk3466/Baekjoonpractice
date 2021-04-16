package com.programmer.year2021.month04.sort;

import java.util.Arrays;
import java.util.Scanner;

public class P1427 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();								// 자리수 입력
		int arr[] = new int [(int) Math.log10(num) + 1];		//입력받은 수의 자리수 만큼 배열 개수 확보
		
		int a  = 10;										//나눌 값 초기화(각 자리수 를 배열에 담기 위함)
		int b = 1;											//각 자리수의 값을 나타내기위한 변수
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (num % a) / b;
			a *= 10;
			b *= 10;
		}
		
		Arrays.sort(arr);
		
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		
	}

}
