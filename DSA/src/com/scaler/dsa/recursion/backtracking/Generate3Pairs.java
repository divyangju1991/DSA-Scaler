package com.scaler.dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Divyang
 * 
 * Given array of N distinct nos. Generate all subsets.
 *
 */
public class Generate3Pairs {
	
	public void gen(int[] a, int idx, int[] input, List<List<Integer>> ans){
		
		if(idx == a.length){
			
			List<Integer> sub = new ArrayList();
			
			for(int i=0; i<a.length; i++){
				
				//We have only 2 choices
				//1 for to pick it up
				//0 for not to pick it up
				if(a[i] == 1) {
					sub.add(input[i]);
				}
			}
			
			ans.add(sub);
			return;
		}
		
		a[idx] = 0;
		gen(a, idx+1, input, ans);
		a[idx] = 1;
		gen(a, idx+1, input, ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = new int[]{1,2,3};
		int[] a = new int[3];
		List<List<Integer>> ans = new ArrayList();
		
		new Generate3Pairs().gen(a, 0, input, ans);
		
		System.out.println(ans);
	}

}
