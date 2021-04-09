package com.programmer.year2021.month04.DFS_BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Chap5_9 {

	public static boolean[] visited = new boolean[9];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 9; i++) {
			graph.add(new ArrayList<Integer>());	//그래프 초기화
		}
		
		 // 노드 1에 연결된 노드 정보 저장 
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);
        
        // 노드 2에 연결된 노드 정보 저장 
        graph.get(2).add(1);
        graph.get(2).add(7);
        
        // 노드 3에 연결된 노드 정보 저장 
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);
        
        // 노드 4에 연결된 노드 정보 저장 
        graph.get(4).add(3);
        graph.get(4).add(5);
        
        // 노드 5에 연결된 노드 정보 저장 
        graph.get(5).add(3);
        graph.get(5).add(4);
        
        // 노드 6에 연결된 노드 정보 저장 
        graph.get(6).add(7);
        
        // 노드 7에 연결된 노드 정보 저장 
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);
        
        // 노드 8에 연결된 노드 정보 저장 
        graph.get(8).add(1);
        graph.get(8).add(7);

        bfs(1);
		
	}

	public static void bfs(int x) {
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(x);
		
		visited[x] = true;	//현재 노드 방문처리
		
		while(!q.isEmpty()) {				//빈 큐가 없을 때 까지
			
			int p = q.poll();  //큐에서 하나의 원소를 뽑아
			System.out.print(p + " ");	//출력
			
			for(int i = 0; i < graph.get(p).size(); i++) {	//해당 원소와 연결된 원소 방문처리
				
				int y = graph.get(p).get(i);
				
				if(!visited[y]) {
					q.offer(y);
					visited[y] = true;	//방문처리
				}
			}
			
		}
		
		
		
		
	}
}
