package com.programmer.year2021.month02;

import java.util.Arrays;
import java.util.Scanner;

public class P1085 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int arr [] = new int[4];	//배열을 준비하여 값 대입
		arr[0] = x;
		arr[1] = w-x;
		arr[2] = h-y;
		arr[3] = y;
		Arrays.sort(arr);		//오름차순 정렬
		
		System.out.println(arr[0]);	//최솟값 출력
	}

}
