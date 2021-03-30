package com.programmer.year2021.month03.implement;

import java.util.Scanner;

import org.junit.Test;

public class Chap4_3 {
	@Test
	public void Chap4_3() {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		int count = 0;
		
	if(st.charAt(0) - 2 >= 'a' ) {
		if(Character.getNumericValue(st.charAt(1)) - 1 >= 1) {
				count++;
			}
		if(Character.getNumericValue(st.charAt(1)) + 1 <= 8) {
				count++;
			}
		}
	if(st.charAt(0) + 2 <= 'h') {
		if(Character.getNumericValue(st.charAt(1)) - 1 >= 1) {
			count++;
		}
		if(Character.getNumericValue(st.charAt(1)) + 1 <= 8) {
			count++;
		}
			
		}
	if(Character.getNumericValue(st.charAt(1)) - 2 >= 1) {
			if(st.charAt(0) - 1 >= 'a') {
				count++;
			}
			if(st.charAt(0) + 1 <= 'h') {
				count++;
			}
		}
	if(Character.getNumericValue(st.charAt(1)) + 2 <= 8) {
			if(st.charAt(0) - 1 >= 'a') {
				count++;
			}
			if(st.charAt(0) + 1 <= 'h') {
				count++;
			}
		}

	System.out.println(count);
		
	}
}
