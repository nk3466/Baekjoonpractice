package com.programmer.year2021.month03.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11399_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		int sum = 0;
		
		//공백을 기준으로 입력이므로 StringTokenizer 객체 이용
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] =  Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		for(int j = 0; j < N; j++) {
			for(int i = 0; i <= j; i++) {
				
				sum += arr[i];
			}
		}
		bw.write(String.valueOf(sum));
		bw.flush();		
		bw.close();
	}

}
