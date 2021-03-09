package com.programmer.year2021.month03;

import java.util.ArrayList;
import java.util.Scanner;

class P13023 {
    static int N, M, ans;
    static ArrayList<Integer>[] graph;
    static boolean[] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            graph[s].add(e);			//친구 추가
            graph[e].add(s);
           // System.out.println(graph[s]);
           // System.out.println(graph[e]);
        }
        ans = 0;
        visit = new boolean[N];
        for (int i = 0; i < N; i++) {
            DFS(i, 1);
            if (ans == 1)
                break;
        }
        System.out.println(ans);
    }

    private static void DFS(int i, int depth) {
        if (depth == 5 || ans == 1) {
            ans = 1;
            return;
        }
        visit[i] = true;
        for (int j = 0; j < graph[i].size(); j++) {		//그래프 사이즈까지
            if (!visit[graph[i].get(j)]) {					//이해 덜됨
                visit[graph[i].get(j)] = true;
                DFS(graph[i].get(j), depth + 1);
                visit[graph[i].get(j)] = false;
            }
        }
        visit[i] = false;
    }
}