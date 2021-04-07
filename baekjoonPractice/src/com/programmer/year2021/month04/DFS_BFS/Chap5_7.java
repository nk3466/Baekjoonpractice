package com.programmer.year2021.month04.DFS_BFS;

import java.util.ArrayList;


public class Chap5_7 {

	//행이 3개인 인접 리스트 방식
	public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

	public static void main(String[] args) {

		for(int i = 0; i < 4; i++) {
			graph.add(new ArrayList<Node>());		//그래프 초기화
		}
		
		//노드 0에 연결된 노드 정보 저장(노드, 거리)
		graph.get(0).add(new Node(1,7));
		graph.get(0).add(new Node(2,5));
		
		//노드 1에 연결된 노드 정보 저장(노드, 거리)
		graph.get(1).add(new Node(0,7));
		
		//노드 2
		graph.get(2).add(new Node(0,5));
		
		System.out.println(graph.size());	//graph : 3 add 해서 그래프 크기 사이즈 초기화, 조정
		for(int i = 0; i < graph.size(); i++) {
			for(int j = 0; j < graph.get(i).size(); j++) {
				graph.get(i).get(j).show();
			}
		}
		
	}
	
	}
		class Node{
			private int index;
			private int distance;
			
			//생성자는 인스턴스 변수 초기화 역할
			public Node(int index, int distance) {
				this.index = index;
				this.distance = distance;
			}
			
			public void show() {
				System.out.println("(" + this.index + "," + this.distance + ")");
			}
	
}
