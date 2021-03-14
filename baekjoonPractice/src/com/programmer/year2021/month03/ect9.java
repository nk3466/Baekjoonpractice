package com.programmer.year2021.month03;

import java.util.LinkedList;
import java.util.Queue;

public class ect9 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>(); //LinkedList내에 구현되고 있는 que 사용
												//que 중에서도 연결 리스트롤 되어있는 걸 구현
		//queue 에 삽입시 offer, 꺼낼 시 poll 사용
		q.offer(5);
		q.offer(2);
		q.offer(3);
		q.offer(7);
		q.poll();		//poll은 꺼낼 뿐만아니라 반환해주는 특징을 가짐
		q.offer(1);
		q.offer(4);
		q.poll();
		
		while(!q.isEmpty()) {
			System.out.println(q.poll() + " ");
		}
	}
}
