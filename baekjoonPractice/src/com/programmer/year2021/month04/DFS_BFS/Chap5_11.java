package com.programmer.year2021.month04.DFS_BFS;

import java.util.Scanner;

public class Chap5_11 {

	static int N;
	static int M;
	static int count;
	static int[][] arr = new int[1000][1000];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 N = sc.nextInt();
		 M = sc.nextInt();
		
		 for(int i = 1; i <= N; i++) {
			 for(int j = 1; j <= M; j++) {
				 arr[i][j] = sc.nextInt();
			 }
		 }
		 System.out.println(bfs(1, 1));
		
	}
	
	public static int bfs(int x, int y) {
		
		
		if(x != N || y != M) {
			
		if(arr[x][y+1] == 1) {
			arr[x][y+1] = 2;		//방문처리
			count++;				//카운트
			bfs(x, y+1);
		}else if(arr[x+1][y] == 1) {
			arr[x+1][y] = 2;
			count++;
			bfs(x+1, y);
		}else if(arr[x-1][y] == 1) {
			arr[x-1][y] =2;
			count++;
			bfs(x-1,y);
		}else if(arr[x][y-1] == 1) {
			arr[x][y-1] =2;
			count++;
			bfs(x,y-1);
		}
		}else if(x == N && y == M){
			count++;
			return count;
			
		}
	
		return count;
	}

}
