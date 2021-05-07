package com.programmer.year2021.month05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10808 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int [] arr = new int[26];
		
		String input = br.readLine();
		
		for(int i = 0; i < input.length(); i++) {
			arr[(int)input.charAt(i) - 97] += 1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			sb.append(" ");
		}
		
		System.out.println(sb);
	}
}
