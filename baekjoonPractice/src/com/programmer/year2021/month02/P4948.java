package com.programmer.year2021.month02;

import java.util.Scanner;

public class P4948 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[246913];			//받을 수 있는 최대 숫자가 123456이므로 2배 숫자보다 1큰 수로 배열 길이 세팅
		
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = i;							// 초기값 대입
		}
		
		arr[0] = arr[1] = 0;						//0과 1은 소수가 아니므로 0으로 초기화
		
		while(true) {
			int a = sc.nextInt();
			int count = 0;
			
			
			if(a == 0) {					//입력받은 값이 0이면 멈춰!
				break;
			}else {
			
				for(int i = 2; i <= a;i++) {				//2부터 최댓값이 N까지 (N까지만출력하면 되므로)
					for(int j = i * 2; j <= 2 * a; j+=i ) {		//배수 형식이면
						arr[j]=0;							//0으로 초기화
					}
				}	
				
			for(int i = a + 1; i <= 2*a ; i++) {		//소수는 0이 아니므로 count 세서 출력
				if(arr[i] != 0) {
					count++;
				}
			}
			System.out.println(count);
			
		}
		
	}

	}
}
