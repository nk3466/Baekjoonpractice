package com.programmer.year2021.month04.DFS_BFS;

import java.util.Scanner;
import java.util.Stack;

public class Chap5_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> st = new Stack<>();
		
		st.push(5);
		st.push(2);
		st.push(3);
		st.push(7);
		st.pop();
		st.push(1);
		st.push(4);
		st.pop();
		
		int n = st.size();
		for(int i = 0; i < n; i++) {
			System.out.print(st.peek() + " ");
			st.pop();
		}
	}

}
