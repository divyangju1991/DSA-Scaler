package com.scaler.dsa.heap.assignment;

import java.util.PriorityQueue;

public class ConnectRopes {
	
	public int solve(int[] A) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int cost = 0;
		
		for(int x : A){
			pq.offer(x);
		}
		
		while(pq.size() != 1){
			
			int min1 = pq.poll();
			int min2 = pq.poll();
			
			int sum = min1 + min2;
			cost += (sum);
			
			pq.offer(sum);
		}
		
		return cost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
