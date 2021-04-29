package com.programmer.year2021.month04;

import java.util.Arrays;
import java.util.Scanner;

public class P11656 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			String abc = sc.nextLine();
			
			  String[] strArray = new String[abc.length()];
		        // 입력 string 크기만큼 배열 생성
		        for (int i = 0; i < abc.length(); i++) {
		            strArray[i] = abc.substring(i,abc.length());
		        }
		        // 하나씩 잘라서 넣고
		        Arrays.sort(strArray);
		        // 알파벳순 정렬
		        for(String str : strArray) {
		           System.out.println(str);
		        }//
		}

}
