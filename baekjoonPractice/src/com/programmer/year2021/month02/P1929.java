package com.programmer.year2021.month02;

import java.util.Scanner;

public class P1929 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();						//입력
		int N = sc.nextInt();
		
		
		int arr[] = new int[1000001];				// 최대 수가 1000000이므로 인덱스 0번부터 포함해서 1000000까지 이므로 1000001개 길이 세팅
		for(int i = 0; i <= arr.length-1; i++) {	// 각 인덱스의 값에 자신의 인덱스 데입 
			arr[i] = i;
			//System.out.println(arr[i]);
		}
		
		arr[0] = arr[1] = 0;						//0과 1은 소수가 아니므로 0으로 초기화
		
		for(int i = 2; i <= N;i++) {				//2부터 최댓값이 N까지 (N까지만출력하면 되므로)
			for(int j = i *2;j <=N; j+=i ) {		//배수 형식이면
				arr[j]=0;							//0으로 초기화
			}
		}
	
		for(int i = M; i <= N; i++) {
			if(arr[i] != 0) {						//0이 아니면 ->  소수!
				System.out.println(arr[i]);			//출력
			}
		}
		
		
	}

}
