package com.programmer.year2021.month03;

import java.util.Scanner;

public class ect2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 0;
//		while(N > 1) {
//			if(N % K == 0) {
//				N /= K;
//				count++;
//			}else {
//				N = N -1;
//				count++;
//			}
//		}
//		System.out.println(count);
		int result = 0;
		while(true){
			//N이 K로 나누어 떨어지는 수가 될 때까지 빼기
			int target = (N / K) * K;	//전체에서 k를 나누면 몫이 나오고, 그거에서 k를 곱하게 되면 나눌 수 있는 수가 나옴
			result = N - target;		//result는 N에서 나누어 떨어지는 수를 뺀 값
			N = target;					//N은 나눌 수 있는 수?
			
			if(N < K) break;		//더이상 나눌 수없을 때 탈출
			result += 1;
			N /= K;
		}
		result += (N - 1);
		System.out.println(result);
	}

}
