package com.programmer.year2021.month01;

import java.util.Scanner;

public class P1110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a / 10;
		int c = a % 10;
		int d = 0;
		int sum = 0;
		int result = 0;
		
			while(true){
				
				d = b + c;
				b = c;
				sum = (b * 10) + (d % 10);
				result++;
				
				if(a == sum) {
					
					break;
				}			
			}			
			System.out.println(result);
			
		}
	

}
