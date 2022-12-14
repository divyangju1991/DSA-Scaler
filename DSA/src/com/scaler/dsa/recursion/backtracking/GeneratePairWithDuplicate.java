package com.scaler.dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Divyang
 * Given array of duplicate nos. Generate all subsets.	
 */
public class GeneratePairWithDuplicate {

	class DistinctNums {
		public int count;
		public int val; 
	}
	
	public void gen(int[] a, int idx, List<DistinctNums> fills, List<List<Integer>> ans){
		
		if(idx == fills.size()){
			
			List<Integer> sub = new ArrayList(); 
			
			//We have only 3 choices
			//1 for to pick it up
			//0 for not to pick it up
			//count of duplicated numbers
			
			for(int i=0; i<fills.size(); i++){
				
				for(int j=0; j<a[i]; j++){
					sub.add(fills.get(i).val);
				}
			}
			ans.add(sub);
			return;
		}
		
		for(int i=0; i<=fills.get(idx).count; i++){
			a[idx] = i;
			gen(a, idx+1, fills, ans);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[]{1,1,2,2};
		
		List<List<Integer>> ans = new ArrayList();
		List<DistinctNums> fills = new ArrayList();
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<input.length; i++){
			
			if(map.get(input[i]) != null){
				map.put(input[i], map.get(input[i]) + 1);
			} else {
				map.put(input[i], 1);
			}
		}
		
		GeneratePairWithDuplicate parent = new GeneratePairWithDuplicate();
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			
			GeneratePairWithDuplicate.DistinctNums fill = parent.new DistinctNums();
			fill.val = entry.getKey();
			fill.count = entry.getValue();
			
			fills.add(fill);
		}
		
		parent.gen(new int[2], 0, fills, ans);
		
		System.out.println(ans);
	}

}
