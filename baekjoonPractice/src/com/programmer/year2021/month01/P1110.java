package com.programmer.year2021.month01;

import java.util.Scanner;

public class P1110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int b = A / 10;
		int c = A % 10;
		int d = 0;
		int result = 0;
		
			while(true){
				
				d = b + c;
				b = c;
				c = d % 10;
				int sum = (b * 10) + (c);
				result++;

				if(A == sum) {
					
					break;
				}			
			}			
			System.out.println(result);
			
		}
	

}
