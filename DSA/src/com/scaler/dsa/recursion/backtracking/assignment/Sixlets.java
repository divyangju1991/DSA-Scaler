package com.scaler.dsa.recursion.backtracking.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Sixlets {
	
	int gen(ArrayList<Integer> list, int reqSize, int sum, int size, int i) {
        if (sum > 1000)
            return 0;
        if (size == reqSize)
            return 1;
        if (i == list.size())
            return 0;
        // Take ith element or leave it.   
        return gen(list, reqSize, sum + list.get(i), size+1, i+1) + gen(list, reqSize, sum, size, i+1);
    }
    public int solve(ArrayList<Integer> list, int reqSize) {
        return gen(list, reqSize, 0, 0, 0);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 8));
		int reqSize = 2;
		
		System.out.println(new Sixlets().solve(list, reqSize)); 
	}

}
