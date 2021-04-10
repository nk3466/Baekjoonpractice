package com.programmer.year2021.month04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1620 {

	    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    static int[][] arr;
	    static boolean[] check;
	    static StringBuilder sb = new StringBuilder();

	    public static void main(String[] args) throws IOException {
	        StringTokenizer st = new StringTokenizer(br.readLine());

	        int n = Integer.parseInt(st.nextToken());		//정점의 갯수
	        int m = Integer.parseInt(st.nextToken());		//간선의 갯수
	        int v = Integer.parseInt(st.nextToken());		//탐색 시작 번호

	        arr = new int[n + 1][n + 1];
	        check = new boolean[n + 1];
	        
	        for(int i = 0 ; i < m; i++){
	            st= new StringTokenizer(br.readLine());
	            int s = Integer.parseInt(st.nextToken());
	            int e = Integer.parseInt(st.nextToken());
	            arr[s][e] = 1;
	            arr[e][s] = 1;
	        }

	        dfs(v);
	        sb.append("\n");
	        bfs(v);

	        System.out.println(sb);
	    }
	    
	    // check배열 false로 초기화
	    public static void initCheck(){
	        for(int i = 0 ; i < check.length; i++) check[i] = false;
	    }

	    //DFS
	    public static void dfs(int start){
	        // 경로 출력
	        sb.append(start + " ");
	        // 현재 노드 방문 처리
	        check[start] = true;

	        for(int i = 1; i < check.length; i++)
	            // 현재 노드와 다른 노드 중 && 미방문 && 간선이 존재
	            if(i != start && check[i] == false && arr[start][i] == 1)
	                dfs(i);

	    }
	    //BFS
	    public static void bfs(int start){
	        // check배열 초기화
	        initCheck();
	        Queue<Integer> queue = new LinkedList<>();

	        // 처음 시작노드 추가
	        queue.add(start);
	        // 처음 시작노드 방문처리
	        check[start] = true;

	        while(!queue.isEmpty()){
	            int num = queue.poll();
	            sb.append(num + " ");

	            for(int i = 1; i < check.length; i++){
	                // 현재 노드와 다른 노드 중 && 미방문 && 간선이 존재
	                if(i != num && check[i] == false && arr[num][i] == 1) {
	                    // 노드 추가
	                    queue.add(i);
	                    check[i] = true;
	                }
	            }
	        }
	        sb.append("\n");
	    }
	}
