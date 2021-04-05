package com.programmer.year2021.month04.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Chap5_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Queue<Integer> qe = new LinkedList<>();
		
		qe.add(5);
		qe.add(2);
		qe.add(3);
		qe.add(7);
		qe.poll();
		qe.add(1);
		qe.add(4);
		qe.poll();
		
		System.out.println(qe);
		
	}

}
