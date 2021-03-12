package com.programmer.year2021.month03;

import java.util.Scanner;

public class ect6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i <= H; i++) {		//입력 받은 시간까지의 시간이 흐를때 마다
			for(int j = 0; j < 60; j++) {		// 60분동안
				for(int s = 0; s < 60; s++) {	//60초 동안
					if(i % 10 == 3 || j / 10 == 3|| j % 10 == 3 || s / 10 == 3 || s % 10 == 3) { //3이 들어간 숫자가 있다면
						count++;
					}
				}
			}
			
		}
		System.out.println(count);
	}

}
