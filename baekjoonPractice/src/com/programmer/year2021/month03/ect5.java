package com.programmer.year2021.month03;

import java.util.Scanner;

public class ect5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();		//버퍼 비우기
		int X = 1;
		int Y = 1;
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < a; i++) {
			String d = sc.nextLine();
			if(d.equals("L")) {
				x -= 1;
			}else if(d.equals("R")) {
				x += 1;
			}else if(d.equals("U")) {
				y += 1;
			}else if(d.equals("D")) {
				y -= 1;
			}
			if(X + x >= 1 && X + x <= 100 && Y + y >= 1 && Y + y <= 100) {		//범위를 넘지 않는 다면
				X += x;
				Y += y;
			}
		}
	System.out.println(X + " " + Y);
	}
	

}
