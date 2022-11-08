package com.scaler.dsa.heap.homework;

import java.util.PriorityQueue;

public class MishaAndCandies {
	
		public int solve(int[] A, int k) {

	        if(A.length < 2){
	            return 0;
	        }

	        PriorityQueue<Integer> pq = new PriorityQueue<>();
			
			for(int i=0; i<A.length; ++i){
				pq.add(A[i]);
			}		
			
			int totalEat = 0;
			
			while(!pq.isEmpty()){
				
				int candy = pq.poll();
				int eat = candy/2;
				totalEat += eat;
				int remains = candy - eat;
				if(pq.isEmpty())
					return totalEat;
				int min = pq.poll();
				int max = min + remains;			
				pq.add(max);
				
				if(pq.peek() > k){
					return totalEat;
				}
			}		
			
			return totalEat;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3, 2, 3}; 
		System.out.println(new MishaAndCandies().solve(a, 4));
		
		int b[] = {355, 667};
		System.out.println(new MishaAndCandies().solve(b, 867));
		
		int c[] = {946, 354, 88, 528, 677, 662, 662, 30, 137, 325, 522, 920, 198, 923, 959, 555, 950, 717, 573, 933, 344, 640, 37, 619};
		System.out.println(new MishaAndCandies().solve(c, 867));
		
	}

}
