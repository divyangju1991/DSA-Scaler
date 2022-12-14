package com.scaler.dsa.hashing.assignment;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PointsOnSameLine {
	
	private boolean isSame(ArrayList<Integer> x, ArrayList<Integer> y, int i, int j){
        return x.get(i).intValue() == x.get(j).intValue() && y.get(i).intValue() == y.get(j).intValue();
    }

    private boolean isVerticalLine(ArrayList<Integer> x, int i, int j){
        return x.get(i).intValue() == x.get(j).intValue();
    }

    private boolean isHorizontalLine(ArrayList<Integer> y, int i, int j){
        return y.get(i).intValue() == y.get(j).intValue();
    }
    
    public int solve(ArrayList<Integer> x, ArrayList<Integer> y) {

        int ans = 0;
        int n = x.size();
        if(n==1){
        	return 1;
        }

        Map<Double, Integer> map = new HashMap<>();

        for(int i=0; i<n-1; ++i){
            int currMax = 0;
            int samePoints = 0;
            int verticalPoints = 0;
            int horizontal = 0;
            map = new HashMap<>();

            for(int j=i+1; j<n; ++j){
                if(isSame(x, y, i, j)){
                    ++samePoints;
                }  else if(isVerticalLine(x, i, j)){
                	++verticalPoints;
                }	else if(isHorizontalLine(y, i, j)){
                    ++horizontal;
                }   else {
                    int xDiff = x.get(j).intValue() - x.get(i).intValue();
                    int yDiff = y.get(j).intValue() - y.get(i).intValue();

                    int z = new BigInteger(String.valueOf(xDiff)).gcd(new BigInteger(String.valueOf(yDiff))).intValue();

                    xDiff /= z;
                    yDiff /= z;

                    double key= (xDiff == 0) ? yDiff : (yDiff*(1.0)/xDiff);
                    map.put(key, map.getOrDefault(key, 0)+1);
                    currMax = Math.max(currMax, map.get(key));
                }
               	                
            }
            currMax = Math.max(Math.max(verticalPoints, horizontal), currMax);
            ans = Math.max(ans, currMax+samePoints+1);                
        }
        return ans;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ArrayList<Integer> x = new ArrayList<>(Arrays.asList(6, -5, 3, -6, 3, -9, -8, -7));
				ArrayList<Integer> y = new ArrayList<>(Arrays.asList(5, 0, -8, 1, -1, 6, 3, -3));
				
				System.out.println(new PointsOnSameLine().solve(x, y));
				
				x = new ArrayList<>(Arrays.asList(3, 1, 4, 5, 7, -9, -8, 6));
				y = new ArrayList<>(Arrays.asList(4, -8, -3, -2, -1, 5, 7, -4));
				
				System.out.println(new PointsOnSameLine().solve(x, y));
				
				x = new ArrayList<>(Arrays.asList(0, -3, -6, 0, -7, 0, 2, 0, 5));
				y = new ArrayList<>(Arrays.asList(-9, -7, -8, -4, -3, 0, -9, -3, 7));
				
				System.out.println(new PointsOnSameLine().solve(x, y));
	}

}
