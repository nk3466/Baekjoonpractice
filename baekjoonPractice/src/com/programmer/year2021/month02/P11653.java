package com.programmer.year2021.month02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P11653 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		while(N > 1 ) {
		for(int i = 1; i <= N; i++) {
			int a = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					//System.out.println("i = " + i);
					a++;
				}
				//System.out.println("a = " + a);
			}
			if(a == 2) {
				if(N % i ==0) {
					//System.out.println(i);
					list.add(i);
					N = N / i;
				}
			}
		  }
		}
		
	
		list.sort(new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			return o1.intValue() > o2.intValue()? 1:-1;
		}
	});
		for(Integer a : list) {
			System.out.println(a);
		}

}
}
