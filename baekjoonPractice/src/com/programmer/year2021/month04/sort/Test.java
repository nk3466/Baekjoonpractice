package com.programmer.year2021.month04.sort;

public class Test {

	
		class Solution {
		    public int[] solution(int[][] v) {
//		        
		        int x = 0;
		        int y = 0;
		        
		        /* 0번째 인덱스 값 찾기 */
		        if(v[0][0] == v[1][0]){
		            x = v[2][0]; 
		        }else if(v[0][0] == v[2][0]){
		            x = v[1][0]; 
		        }else if(v[1][0] == v[2][0]){
		            x = v[0][0];
		        }
		        /* 1번째 인덱스 값 찾기 */
		        if(v[0][1] == v[1][1]){
		            y = v[2][1];
		        }else if(v[0][1] == v[2][1]){
		            y = v[1][1];
		        }else if(v[1][1] == v[2][1]){
		            y = v[0][1];
		        }
		        
		        int[] answer = {x,y};
		        
		        System.out.println(answer);

		        return answer;
		    }
		}

	
}
