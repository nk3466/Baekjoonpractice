package com.programmer.year2021.month03;

import java.util.Stack;

public class ect8 {

	public static void main(String[] args) {

		Stack<Integer> a = new Stack<>();	//stack내에서 사용할 자료형 Integer class이용
		
		a.push(5);	//넣을 때 push
		a.push(2);
		a.push(3);
		a.push(7);
		a.pop();	//뺄 때 pop
		a.push(1);
		a.push(4);
		a.pop();
		
		while(!a.empty()) {
			System.out.print(a.peek() + " ");	//stack의 최상단 원소를 출력할 때 사용
			a.pop();	// 출력후 꺼내기를 반복
		}
	}

}
