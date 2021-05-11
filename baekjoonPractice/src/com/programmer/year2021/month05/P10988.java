package com.programmer.year2021.month05;

import java.util.Scanner;

public class P10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(s);
		String reverse = sb.reverse().toString(); 
		
		if(s.equals(reverse)) 
			System.out.println("1");
		else // 팰린드롬이 아니면
			System.out.println("0");

	}

}
