package com.programmer.year2021.month04;

import java.util.Scanner;

public class Past03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		int arr[] = new int[8];
		
		arr[2] = 1;		//2개가 필요한것 1개
		arr[3] = 1;		//3개가 필요한 것 1개
		arr[4] = 1;		//4개가 필요한 것 1개
		arr[5] = 3;		//5개가 필요 한 것 3개
		arr[6] = 3;		//6개가 필요한 것 3개
		arr[7] = 1;		//7개가 필요한 것 1개
		
		int regist = 1;
		
		int result = 1;
		int count = 0;
		while(k>=0) {
			for(int i = 7; i > 1; i--) {
				if(k - i == 0) {
					result += arr[i];
					count += arr[i];
					k -= i;
					return;
				}else {
					for(int j = i; j > 1; j--) {
						if(k - j >=0) {
							result *= arr[i];
							k -= j;
							return;
						}
					}
					if(k == 0) {
						count += result;
					}
				}
			}
		}
		System.out.println(count);
	}
	
}
