package com.programmer.year2021.month02;

import java.util.Scanner;

public class P4673 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int [10000];				//초기값이 0으로 되어있음!
		
		for(int i = 0; i < arr.length; i++) {		//셀프 넘버가 10000이 넘으면 패스
			if(d(i) >= 10000) {
				continue;
				
			}else {									//10000이 안넘으면 1로 바꾸기
			arr[d(i)] = 1;
			}
			
		}
			for(int j = 1; j < arr.length; j++) {		//1로 바뀐값이 아닌(셀프넘버)출력
				if(arr[j] == 0) {
					System.out.println(j);
				}
			}
		
		
	}
	
	public static int d(int n) {
		
		int q = n / 1000;			//천의자리
		int w = (n % 1000) / 100;	//백의자리
		int e = (n % 100) / 10;		//십의자리
		int r = n%10;				//일의자리
		
		
		return n + q + w + e + r;
	}

}
