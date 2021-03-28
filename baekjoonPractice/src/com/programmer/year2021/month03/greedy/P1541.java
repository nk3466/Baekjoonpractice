package com.programmer.year2021.month03.greedy;

import java.util.Scanner;

public class P1541 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		String a[] = sc.nextLine().split("\\-");
		
		int result = 0;
		
		
		for(int i = 0; i < a.length; i++) {
			String q[] = a[i].split("\\+");
			int sum = 0;
			for(int j = 0; j < q.length; j++) {
				sum += Integer.parseInt(q[j]);
				
			}
			if(i == 0) {
				result += sum;
			}else {
				result -= sum;
			}
			//System.out.println("sum" + sum);
			//System.out.println("result" + result);
		}
		System.out.println(result);
			
		
		
		
//		for(String y : a) {
//			System.out.println(y);
//		}
	}

}
