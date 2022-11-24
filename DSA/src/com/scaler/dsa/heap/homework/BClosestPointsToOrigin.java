package com.scaler.dsa.heap.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class BClosestPointsToOrigin {
	
	public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> points, int k) {
        
        PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<>((p1, p2) -> p2.get(0) * p2.get(0) + p2.get(1) * p2.get(1) - p1.get(0) * p1.get(0) - p1.get(1) * p1.get(1));

        for(ArrayList<Integer> p : points){
            pq.offer(p);

            if(pq.size()>k){
                pq.poll();
            }
        }

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        while(k>0){
            --k;
            res.add(pq.poll());
        }

        return res;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,3));
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(-2,2));
		
		ArrayList<ArrayList<Integer>> points = new ArrayList<>();
		points.add(list1);
		points.add(list2);
		
		System.out.println(new BClosestPointsToOrigin().solve(points, 1));
		
	}

}
