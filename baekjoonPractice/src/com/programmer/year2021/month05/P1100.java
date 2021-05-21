package com.programmer.year2021.month05;

import java.util.Scanner;

public class P1100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String[] chess_board = new String[8];
		int res=0;
		
		for(int i=0;i<8;i++) {
			chess_board[i] = sc.nextLine();
		}
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(i%2==0 && j%2==0 && chess_board[i].charAt(j)=='F') res++;
				else if (i%2==1 && j%2==1 && chess_board[i].charAt(j)=='F') res++;
			}
		}
		
		System.out.println(res);
	}
}
