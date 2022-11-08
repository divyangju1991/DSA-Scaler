package com.scaler.dsa.queue.assignment;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class SlidingWindow {
	
	public ArrayList<Integer> slidingMaximum(final List<Integer> list, int k) {
		
		ArrayList<Integer> ans = new ArrayList<>();
		int n = list.size();
		
		Deque < Integer > maxDeque = new ArrayDeque < Integer > ();
		int max = Integer.MIN_VALUE;
		int i=0;
		for(; i<k; i++){
			
			while(!maxDeque.isEmpty() && list.get(maxDeque.getLast()) <= list.get(i)){
				maxDeque.removeLast();
			}
			
			maxDeque.addLast(i);
			
		}
		ans.add(list.get(maxDeque.getFirst()));
		
		
		for(; i<n; i++){
			
			while(!maxDeque.isEmpty() && list.get(maxDeque.getLast()) <= list.get(i)){
				maxDeque.removeLast();
			}
			
			maxDeque.addLast(i);
			
			while (i - maxDeque.getFirst() >= k) {
				maxDeque.removeFirst();
            }
			
			ans.add(list.get(maxDeque.getFirst()));
		}
		
		return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//o/p :  [3, 3, 5, 5, 6, 7]
		System.out.println(new SlidingWindow().slidingMaximum(new ArrayList<>(Arrays.asList(1, 3, -1, -3, 5, 3, 6, 7)), 3));
		
		//o/p :  [7, 7, 7, 7]
		System.out.println(new SlidingWindow().slidingMaximum(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 7, 1, 3, 6)), 6));
	}

}
