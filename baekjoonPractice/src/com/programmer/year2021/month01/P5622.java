package com.programmer.year2021.month01;

import java.util.Scanner;

public class P5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String abc = sc.nextLine();
		int count = 0;
		
		for(int i = 0; i < abc.length(); i++) {
			if(abc.charAt(i)== 'A' || abc.charAt(i)== 'B'||abc.charAt(i)== 'C' ) {
				count += 3;
				//System.out.println(2);
			}else if(abc.charAt(i)== 'D' || abc.charAt(i)== 'E'||abc.charAt(i)== 'F') {
				count += 4;
				//System.out.println(3);
			}else if(abc.charAt(i)== 'G' || abc.charAt(i)== 'H'||abc.charAt(i)== 'I') {
				count += 5;
				//System.out.println(4);
			}else if(abc.charAt(i)== 'J' || abc.charAt(i)== 'K'||abc.charAt(i)== 'L') {
				count += 6;
				//System.out.println(5);
			}else if(abc.charAt(i)== 'M' || abc.charAt(i)== 'N'||abc.charAt(i)== 'O') {
				count += 7;
				//System.out.println(6);
			}else if(abc.charAt(i)== 'P' || abc.charAt(i)== 'Q'||abc.charAt(i)== 'R'||abc.charAt(i)== 'S') {
				count += 8;
				//System.out.println(7);
			}else if(abc.charAt(i)== 'T' || abc.charAt(i)== 'U'||abc.charAt(i)== 'V') {
				count += 9;
				//System.out.println(8);
			}else if(abc.charAt(i)== 'W' || abc.charAt(i)== 'X'||abc.charAt(i)== 'Y'||abc.charAt(i)== 'Z') {
				count += 10;
				//System.out.println(9);
			}
		}
		System.out.println(count);
	}
}
