package com.programmer.year2021.month02;

import java.util.Scanner;

public class P3053 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		
		System.out.println(r * r * Math.PI); // 우리가 일반적으로 알고있는 원의 넓이
		System.out.println(r * r * 2);		//택시 기하학에서의 거리는 대각선의 경우 가로 하기 세로의 값이므로 
											// 일정한 거리의 모양을생각했을때 정사각형의 45도 기울어진 모양이 나옴
	}

}
