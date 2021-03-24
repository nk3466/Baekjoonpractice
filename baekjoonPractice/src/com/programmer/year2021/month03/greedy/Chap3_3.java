package com.programmer.year2021.month03.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Chap3_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//행의 개수
		int M = sc.nextInt(); 	//열의 갯수
		int arr[] = new int[M];	//열의 갯수로 배열 크기 지정
		
		int min = 0;
		for(int j = 0; j < N; j++) {
			for(int i = 0; i < M; i++) {
				arr[i] = sc.nextInt();	//입력받은값을
			}
			Arrays.sort(arr);	//오름차순하여
			if(min < arr[0]) {

				min = arr[0];	//최솟 값보다 큰수 고르기
			}

		}
		System.out.println(min);
	}

}
