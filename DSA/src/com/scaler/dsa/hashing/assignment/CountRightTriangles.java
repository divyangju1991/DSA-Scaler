package com.scaler.dsa.hashing.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountRightTriangles {
	
	public int solve(ArrayList<Integer> x, ArrayList<Integer> y) {

        int n = x.size();
        int mod = 1000 * 1000 * 1000 + 7;
        int ans = 0;

        Map<Integer,Integer> xPoints = new HashMap<>();
        Map<Integer, Integer> yPoints = new HashMap<>();

        for(int i=0; i<n; i++){
            int xPointMapKey = x.get(i);
            xPoints.put(xPointMapKey, xPoints.getOrDefault(xPointMapKey, 0)+1);

            int yPointMapKey = y.get(i);
            yPoints.put(yPointMapKey, yPoints.getOrDefault(yPointMapKey, 0)+1);
        }

        for(int i=0; i<n; i++){
            int a = xPoints.get(x.get(i));
            int b = yPoints.get(y.get(i));

            ans = ans + ((a - 1) * (b - 1) % mod);
        }

        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> x = new ArrayList<>(Arrays.asList(1, 1, 2));
		ArrayList<Integer> y = new ArrayList<>(Arrays.asList(1, 2, 1));
		
		System.out.println(new CountRightTriangles().solve(x, y));
	}

}
