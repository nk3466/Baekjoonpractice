package com.programmer.year2021.month01;

import java.util.Scanner;

public class P10809 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String abc = sc.nextLine();
		int arr[] = new int[26];
		
		for(int o = 0; o < arr.length; o++) {
			arr[o] =-1;
		}
		
		for(int i = 0; i < abc.length(); i++){
			
			if(abc.charAt(i) >= 97 && abc.charAt(i) <= 122) {
				
				if(arr[((int)abc.charAt(i))-97] == -1) {
					//System.out.println(arr[((int)abc.charAt(i))-97]);
					arr[((int)abc.charAt(i))-97]=i;
				}
			}
		}
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		
		}

}