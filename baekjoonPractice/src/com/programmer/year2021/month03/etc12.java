package com.programmer.year2021.month03;

import java.util.Scanner;

public class etc12 {

	public static int n, m;
	public static int[][] graph = new int[1000][1000];
	
	public static boolean dfs(int x, int y) {

		if(x <= -1 || x >= n || y <= -1 || y >= m) {
			return false;
		}
		if(graph[x][y] == 0) {
			graph[x][y] = 2;
			
			//상, 하, 좌, 우의 위치 호출
			dfs(x - 1, y);
			dfs(x, y - 1);
			dfs(x + 1, y);
			dfs(x, y + 1);
			return true;
		}
		return false;

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		String a = sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				graph[i][j] = a.charAt(j) - '0';
			}
		}
		int result = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(dfs(i,j)) {		//처음 방문 한 경우에만
					result += 1;
				}
			}
		}
		System.out.println(result);
	}

}
