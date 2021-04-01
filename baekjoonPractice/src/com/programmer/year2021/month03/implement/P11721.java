package com.programmer.year2021.month03.implement;

import java.util.Scanner;

public class P11721 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		int ind = 0;
		int count = st.length()/10;		//10으로 나눈 몫 구하기
		
		
		for(int i = 0; i < count ; i++) {			//10개씩 끊어서 출력
			for(int j = 0; j < 10; j++) {
				System.out.print(st.charAt(ind));
				ind++;				
			}
			System.out.println();
		}
		for(int i = ind;i < st.length(); i++) {		//나머지 출력
			System.out.print(st.charAt(i));
		}
	}

}
