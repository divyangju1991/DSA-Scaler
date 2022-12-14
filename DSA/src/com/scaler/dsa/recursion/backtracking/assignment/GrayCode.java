package com.scaler.dsa.recursion.backtracking.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class GrayCode {

	public ArrayList<Integer> grayCode(int a) {
		int n = a;
		
		ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(0));
		
		for(int i=0; i<n; i++){
			int currSize = ans.size();
			
			for(int j=currSize-1; j>=0; j--){
				ans.add(ans.get(j)+(1<<i));
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new GrayCode().grayCode(10));
		System.out.println(new GrayCode().grayCode(10).size());
	}

}
