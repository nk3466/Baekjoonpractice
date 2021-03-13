package com.programmer.year2021.month03;

import java.util.Scanner;

public class ect7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int col = input.charAt(0) - 'a' + 1;
		int row = input.charAt(1) - '0';
		
		int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
		int[] dy = {-1, -2, -2, 1, -1, 2, 2, -1};
		
		int result = 0;
		for(int i = 0; i < 8; i++) {
			int nextRow = row + dx[i];
			int nextCol = col + dy[i];
			if(nextRow >= 1 && nextRow <= 8 && nextCol >= 1 && nextCol <= 8) {
				result += 1;
			}
		}
		System.out.println(result);
	}
	

}
