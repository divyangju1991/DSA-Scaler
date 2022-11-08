package com.scaler.dsa.heap.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {
	
	public int[] solve(int[] A) {

        int N = A.length;
        int[] ans = new int[N];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
                
        maxHeap.add(A[0]);
        ans[0] = A[0];
        int midSize = 1;
                
        for (int i = 1; i < N; i++) {
        
        	if(((i+1) % 2) == 1)
        		++midSize;
        	
        	int maxSize = maxHeap.size();
        	int minSize = minHeap.size();
        	
        	if(maxHeap.peek() < A[i]){
        		minHeap.add(A[i]);
        	}  else {
        		maxHeap.add(A[i]);
        	}
        	
        	if(minSize >= midSize){
        		int max = maxHeap.poll();
        		maxHeap.add(minHeap.poll());
        		minHeap.add(max);
        	} else if(midSize != 1 && maxSize == midSize){
        		int max = maxHeap.poll();
        		minHeap.add(max);
        	}
        	
        	ans[i] = maxHeap.peek();        	
        	
        }

        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 59, 64, 10, 39};
		System.out.println(Arrays.toString(new RunningMedian().solve(a)));
	}

}
