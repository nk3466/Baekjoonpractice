package com.programmer.year2021.month05;

import java.util.Scanner;

public class P1042 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        StringBuilder first = new StringBuilder(sc.next());

	        for (int j = 1; j < n; j++) {
	            StringBuilder temp = new StringBuilder(sc.next());

	            for (int i = 0; i < first.length(); i++) {
	                if (first.charAt(i) != temp.charAt(i)) {
	                    first.setCharAt(i, '?');;
	                }
	            }
	        }
	        sc.close();
	        System.out.print(first);

	}

}
