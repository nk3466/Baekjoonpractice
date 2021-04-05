package com.programmer.year2021.month04.DFS_BFS;

public class Chap5_4 {

	public static void main(String[] args) {
		recursice(1);
	}
	public static void recursice(int i) {
		
		System.out.println("재귀함수 호출");
		i++;
		if(i == 100) {
			return;
		}
		recursice(i);
	}
}
