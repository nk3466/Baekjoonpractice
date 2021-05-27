package com.programmer.year2021.month05;

import java.util.Scanner;

class Result8 {
    public static void main(String[] args) {
      
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	int door[] = new int[n+1];
    	door[0] = 0;	//항상 닫아둠
    	
    	for(int j = 0; j < n; j++) {		//n번 반복
    		
    	for(int i = 1; i < door.length; i++) {
    		door[i] = 1;			// 0번 인덱스 빼고 모든 방 열기
    	}
    	
    	for(int i = 2; i < door.length; i++) {
    		door[i] = 0;		//2의 배수 닫기
    		i++;
    	}
    	
    	for(int i = 3; i < door.length; i++) {
    		if(door[i] == 0) {
    			door[i] = 1;		//닫혀있으면 열기
    		}else {
    			door[i] = 0;		//열려 있으면 닫기
    		}
    		i += 2;
    	}
    	}
	    int count = 0;
	    for(int i = 0; i < door.length; i++) {	// 열려있는 문 체크
	    	if(door[i] == 1) {
	    		count++;
	    	}
	    }
	    System.out.println(count);
	    }
}
