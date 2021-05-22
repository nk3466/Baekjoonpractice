package com.programmer.year2021.month05;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Result3 {
	
	static int[][] direction = new int[][] { { 0, -1 }, { -1, 0 }, { 1, 0 }, { 0, 1 } };		//상하좌우 방향
	
	public static int countMatches(List<String> grid1, List<String> grid2) {
	     
		Set<String> list1 = new HashSet<>();
		Set<String> list2 = new HashSet<>();
		boolean[][] visited1 = new boolean[grid1.size()][grid1.get(0).length()];			//방문 배열 초기화
		boolean[][] visited2 = new boolean[grid1.size()][grid1.get(0).length()];
		
		for (int i = 0; i < grid1.size(); i++) {
			for (int j = 0; j < grid1.get(i).length(); j++) {
				if (grid1.get(i).charAt(j) == '1' && !visited1[i][j]) {
					visited1[i][j] = true;													//방문처리
					list1.add(dfs(grid1, i, j, visited1, new StringBuilder("(" + i + "," + j + ")")).toString());
					System.out.println("list1 : " + list1);
				}
				if (grid2.get(i).charAt(j) == '1' && !visited2[i][j]) {
					visited2[i][j] = true;
					list2.add(dfs(grid2, i, j, visited2, new StringBuilder("(" + i + "," + j + ")")).toString());
					System.out.println("list2 : " + list2);
				}
			}
		}
		int count = 0;
		for (String s : list1) {
			if (list2.contains(s))
				count++;
		}
		return count;
    }
	
	public static StringBuilder dfs(List<String> grid, int row, int col, boolean[][] visited, StringBuilder sb) {
		for (int i = 0; i < 4; i++) {
			int newRow = row + direction[i][0];
			int newCol = col + direction[i][1];
			if (isValid(grid, newRow, newCol) && !visited[newRow][newCol] && grid.get(newRow).charAt(newCol) == '1') {
				sb = sb.append("(" + newRow + "," + newCol + ")");
				visited[newRow][newCol] = true;
				dfs(grid, newRow, newCol, visited, sb);
			}
		}
		return sb;
	}
	
	public static boolean isValid(List<String> grid, int i, int j) {
		return i >= 0 && j >= 0 && i < grid.size() && j < grid.get(0).length();
	}
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

	        int grid1Count = Integer.parseInt(bufferedReader.readLine().trim());

	        List<String> grid1 = IntStream.range(0, grid1Count).mapToObj(i -> {
	            try {
	                return bufferedReader.readLine();
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        })
	            .collect(toList());

	        int grid2Count = Integer.parseInt(bufferedReader.readLine().trim());

	        List<String> grid2 = IntStream.range(0, grid2Count).mapToObj(i -> {
	            try {
	                return bufferedReader.readLine();
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        })
	            .collect(toList());

	        int result = Result3.countMatches(grid1, grid2);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
}
