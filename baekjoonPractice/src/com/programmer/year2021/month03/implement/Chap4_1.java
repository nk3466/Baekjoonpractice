package com.programmer.year2021.month03.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap4_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int x = 1;
		int y = 1;
		
		String A = br.readLine();
		
		for(int i = 0; i < N; i++) {		//입력받은 값에 따라 이동을 다르게 설정
			String[] B = A.split(" ");
			
			if(B[i].equals("L")) {
				if(x - 1 >= 1) {			//범위에 맞는 경우 실행
					x -= 1;
				}
			}else if(B[i].equals("R")) {
				if(x + 1 >= 1) {
					x += 1;
				}
			}else if(B[i].equals("U")) {
				if(y - 1 >= 1) {
					y -= 1;
				}
			}else if(B[i].equals("D")) {
				if(y + 1 >= 1) {
					y += 1;
				}
			}
		}
		System.out.println(x +" " + y);
	}

}
