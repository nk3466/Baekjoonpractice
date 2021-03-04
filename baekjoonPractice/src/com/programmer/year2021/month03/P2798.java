package com.programmer.year2021.month03;

import java.util.Scanner;

public class P2798{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();			//N장의 카드가 주어짐
		int M = sc.nextInt();			
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		int Allresult = result(arr, N, M);
		System.out.println(Allresult);
				
		
	}

	
	static int result(int[]arr, int N, int M) {
	
		int result = 0;
		
		for(int i = 0; i < N -2; i++) {		//모든 카드를 조회하면서 합을 비교함
			
			for(int j = i + 1; j < N-1; j++) {
				
				for(int l = j + 1; l < N; l++) {
					
					int sum = arr[i] + arr[j] + arr[l];
					
					
					if(M == sum) {
						return sum;
					}
					
					if(result < sum && sum < M) {
						result = sum;
					}
					
				}
				
			}
		}
		return result;
	}
}


