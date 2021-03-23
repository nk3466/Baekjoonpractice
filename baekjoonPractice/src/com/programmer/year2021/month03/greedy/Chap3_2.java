package com.programmer.year2021.month03.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Chap3_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//받을 수 있는 수의 갯수
		int M = sc.nextInt();	//더해지는 횟수
		int K = sc.nextInt();	//연속해서 더해질 수 있는 횟수
		
		int arr[] = new int[N];	//N개의 배열 준비
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);		//배열 오름차순 정렬
		int sum = 0; 			//변수 초기화

		if(arr[N-1] != arr[N -2]) {
			sum += arr[N-2] * (M / K) + arr[N-1] *(M - (M/K));	//두번째로 큰 수는 몫만큼 더해지며, 가장 큰 수는 그 갯수를 뺀만큼 더해짐
		}else {
			sum += arr[N-1] * M;	//arr[N-1]과 arr[N-2]가 같은 수 이므로 더해야 할 횟수로 곱해줌
		}
		System.out.println(sum);
	}

}
