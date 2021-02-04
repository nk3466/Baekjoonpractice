package com.programmer.year2021.month02;

import java.util.Scanner;

public class P1193 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int count = 1; 
		int down = 0;
		int up = 0;
		
		while(a > count) {
			a -= count;
			//System.out.println(a);
			count ++;
		}
		//System.out.println("count" + count);
		
		if(count % 2 != 0) {	//짝수 일때랑 수 일때랑 규칙이 다름! 
			down = a;
			up = count + 1 - down;
			
		}else {
			up = a;
			down = count + 1 - up;
		}
		
		
		System.out.println(up + "/" + down );
	}

}
