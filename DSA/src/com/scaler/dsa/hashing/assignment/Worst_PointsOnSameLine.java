package com.scaler.dsa.hashing.assignment;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Worst_PointsOnSameLine {
	
	public int solve(ArrayList<Integer> x, ArrayList<Integer> y) {

        int ans = 1;
        int n = x.size();

        Map<Double, Integer> map = new HashMap<>();

        for(int i=1; i<n; i++){
            int currMax = 1;
            int same = 0;
            int p1X = x.get(0);
            int p1Y = y.get(0);

            for(int j=0; j<i; j++){
            	
            	double slope;
            	int p2X = x.get(j);
            	int p2Y = y.get(j);
            	
                if(p1X == p2X && p1Y == p2Y){
                    ++same;
                    ++currMax;
                    continue;
                } else {
                	
                	if(x.get(i) == x.get(j)) {
                		slope = Double.MAX_VALUE;
                	} else {
                		int xDiff = Math.abs(p2X - p1X);
                        int yDiff = Math.abs(p2Y - p1Y);

                        int z = new BigInteger(String.valueOf(xDiff)).gcd(new BigInteger(String.valueOf(yDiff))).intValue();

                        xDiff /= z;
                        yDiff /= z;

                        slope = (xDiff == 0) ? (double) yDiff : ((double) yDiff/ (double) xDiff);
                	}
                    
                    if(map.get(slope) == null){
                        map.put(slope, 1);
                    } else {
                        map.put(slope, map.get(slope)+1);
                    }

                    currMax = Math.max(currMax, map.get(slope)+same);
                }
            }

            ans = Math.max(ans, currMax);
            map.clear();
        }

        return ans;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> x = new ArrayList<>(Arrays.asList(6, -5, 3, -6, 3, -9, -8, -7));
		ArrayList<Integer> y = new ArrayList<>(Arrays.asList(5, 0, -8, 1, -1, 6, 3, -3));
		
		System.out.println(new Worst_PointsOnSameLine().solve(x, y));
		
		x = new ArrayList<>(Arrays.asList(3, 1, 4, 5, 7, -9, -8, 6));
		y = new ArrayList<>(Arrays.asList(4, -8, -3, -2, -1, 5, 7, -4));
		
		System.out.println(new Worst_PointsOnSameLine().solve(x, y));
	}

}
