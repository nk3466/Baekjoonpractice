package com.programmer.year2021.month02;

import java.util.Scanner;

public class P10870 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
			System.out.println(pibonachi(n));
		
	}
	public static int pibonachi(int a) {
		
		if(a == 0) {		//0일때 0반환
			return a;
		}else if(a == 1) {	//1일때 1반환
			return 1;
		}
		return pibonachi(a-1) + pibonachi(a-2);
	}

}
