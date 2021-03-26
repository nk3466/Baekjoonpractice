package com.programmer.year2021.month03.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P11047_1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
	
		int count = 0;
		int arr[] = new int[N];
		
		for(int i = 0;i < N;i++) {
			arr[i] =  Integer.parseInt(br.readLine());
		}
		
		for(int i = N-1; i >= 0; i--) {
			int check = 0;
			if(arr[i] <= K) {
				check = K / arr[i];
				count += check;
				K -= arr[i] * check;
			}
		}
		
		bw.write(String.valueOf(count));
		bw.flush();		
		bw.close();
	}
}
