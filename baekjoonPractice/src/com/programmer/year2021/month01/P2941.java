package com.programmer.year2021.month01;

import java.util.Scanner;

public class P2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String abc = sc.nextLine();
		
		for(int i = 0; i < 1; i++) {
			abc = abc.replace("c=","a");
			abc = abc.replace("c-", "a");
			abc = abc.replace("dz=", "a");
			abc = abc.replace("d-", "a");
			abc = abc.replace("lj", "a");
			abc = abc.replace("s=", "a");
			abc = abc.replace("z=", "a");
			abc = abc.replace("nj", "a");
			
//			System.out.println(abc);
			}
		System.out.println(abc.length());
		
		
	}

}
