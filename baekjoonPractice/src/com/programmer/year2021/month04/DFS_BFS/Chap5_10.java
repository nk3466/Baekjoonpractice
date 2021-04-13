package com.programmer.year2021.month04.DFS_BFS;

import java.util.Scanner;

public class Chap5_10 {
	
	static int N;
	static int M;
	
	static int arr[][]= new int[1000][1000];
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();	//세로
		 M = sc.nextInt();	//가로
		
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int count = 0;
		
		for(int i = 0; i < N; i++) {		//범위를 돌아다니며 check
			for(int j = 0; j < M; j++){
				check(i,j);
				if(check(i, j)){
					count++;
				}
			}
		}
		
		System.out.println(count);

		
		
	}
	
	public static boolean check(int x, int y) {
		
		if(x < 0 || y < 0 || x >= N || y >= M ) {
			return false;			//범위를 벗어나면 false
		}
		if(arr[x][y] == 0) {	//아직 방문하지 않았다면
			
			arr[x][y] = 2;		//방문처리
			
			check(x-1, y);		//상, 하, 좌, 우 방문처리ㅣ
			check(x,y-1);
			check(x+1, y);
			check(x, y+1);
			
			return true;
		}
		
		
		return false;
	}
}
