package com.scaler.dsa.sorting.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumDiff {
	
	public int solve(ArrayList<Integer> list){
		int ans = 0;
		int max = 0;
		int min = 0;
		int n = list.size();
		int mod = (1000 * 1000 * 1000) + 7;
		
		for(int i=0; i<n; i++){
			min *= 2;
			min = (min + list.get(i)) % mod;
		}
		
		for(int i=n-1; i>=0; i--){
			max *= 2;
			max = (max + list.get(i)) % mod;
		}
		
		ans = (max - min + mod) % mod;
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SumDiff().solve(new ArrayList<Integer>(Arrays.asList(1, 2))));
	}

}
