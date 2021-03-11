package com.programmer.year2021.month03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ect4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //N명의 모험가

		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			arrayList.add(sc.nextInt());
		}
		Collections.sort(arrayList);		//오름차순 정렬
		
		int result = 0;	// 총 그룹의수
		int count = 0;	//그룹에 포함된 모험가의 수
		for(int i = 0; i < N; i++) {
			count += 1;
			if(count >= arrayList.get(i)) {
				result += 1;
				count = 0;
				
			}
		}
		System.out.println(result);
		
		
	}

}
