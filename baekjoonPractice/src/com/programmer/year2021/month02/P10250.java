package com.programmer.year2021.month02;

import java.util.Scanner;

public class P10250 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int T = sc.nextInt();
		
		
		
		for(int i = 0; i < T; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			int YY = N % H;
			int XX = (N / H) + 1;
			if(YY == 0) {//나머지가 0일 경우 YY는 0이 되기 때문에 반례 처리를 해줘야함
				YY = H;
				XX -=1;
			}
			System.out.println( String.valueOf(YY) + String.format("%02d",XX));
		}
	}

}
