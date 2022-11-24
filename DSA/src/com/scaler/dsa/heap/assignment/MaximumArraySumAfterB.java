package com.scaler.dsa.heap.assignment;

import java.util.PriorityQueue;

public class MaximumArraySumAfterB {
	
    public int solve(int[] a, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : a)
            pq.add(x);
 
        // Do k negations by removing a minimum element k times
        while (k-- > 0)
        {
            // Retrieve and remove min element
            int temp = pq.poll();
 
            // Modify the minimum element and add back
            // to priority queue
            temp *= -1;
            pq.add(temp);
        }
 
        // Compute sum of all elements in priority queue.
        int sum = 0;
        for (int x : pq)
            sum += x;
            
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
