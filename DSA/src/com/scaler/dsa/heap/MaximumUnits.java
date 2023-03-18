package com.scaler.dsa.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumUnits {
	
	 public static int maximumUnits(int[][] boxTypes, int truckSize) {
	       PriorityQueue<int[]> queue = new PriorityQueue<>((a, b)->b[1] - a[1]);
	       queue.addAll(Arrays.asList(boxTypes));
	       int unitCount = 0;
	       while(!queue.isEmpty()){
	    	   int[] top = queue.poll();
	    	   int boxCount = Math.min(truckSize, top[0]);
	    	   unitCount += boxCount * top[1];
	    	   truckSize -= boxCount;
	    	   if(truckSize <= 0){
	    		   break;
	    	   }
	       }
	       return unitCount;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] boxes = {1, 2, 3};

        int[] unitsPerBox = {3, 2, 1};
        
        int n = boxes.length;
        
        int[][] boxAndUntis = new int[n][2];
        
        for(int i=0; i<n; ++i){
            boxAndUntis[i][0] = boxes[i];
            boxAndUntis[i][1] = unitsPerBox[i];
        }
        
        int truckSize = 3;
        
        System.out.println(maximumUnits(boxAndUntis, truckSize));
	}

}
