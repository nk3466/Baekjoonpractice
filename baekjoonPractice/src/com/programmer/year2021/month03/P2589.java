package com.programmer.year2021.month03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2589 {

	static int H, W;
	static int dx[] = {1, 0, -1, 0};
	static int dy[] = {0, 1, 0, -1};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();	//보물 지도 세로 크기
		int W = sc.nextInt();	//보물 지도 가로 크기
		
		String map[][] = new String[H][W]; // 보물지도
		
		for(int i = 0; i < H; i++) {
			String str = sc.next();
			for(int j = 0; i < W; j++) {
				map[i][j] = str.substring(j, j+1);
			}
		}
		
		int answer = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				int map_max = 0;
				if(map[i][j].equals("L")) {
					map_max = bfs(i, j, map);
				}
				if(map_max > answer) {
					answer = map_max;
				}
			}
		}
		System.out.println(answer);
	}
	
	private static int bfs(int x, int y, String[][] map) {
		String copy_map[][] = new String[H][W];
		//한번에 방문한 지점에 X표시
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				copy_map[i][j] = map[i][j];
			}
		}
		
		int time[][] = new int[H][W];//각 지점에 더달하기 까지 걸리는 시간
		
		Queue<XY> Q = new LinkedList<XY>();
		
		copy_map[x][y] = "X";	//한번 방문 했으므로 x
		time[x][y] = 0;//시작 지점까지 걸리는 시간은 0
		
		while(!Q.isEmpty()) {
			XY node = Q.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];//상하좌우로 한 칸씩 이동
				
			if(nx >= 0 && ny >= 0 && nx < H && ny < W && copy_map[nx][ny].equals("L")) {
				Q.add(new XY(nx, ny));//큐에 저장
				copy_map[nx][ny] = "x";//방문했으므로 X
				
				time[nx][ny] = time[node.x][node.y] + 1;//시간 증가
			}
			}
		}
		
		
	int max = 0;
	for(int i = 0; i < H; i++) {
		for(int j = 0; j < W; j++) {
			if(time[i][j] > max) {
				max = time[i][j];
			}
		}
	}
	
	return max;
	}
}
	class XY{
		int x; int y;
		public XY(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
