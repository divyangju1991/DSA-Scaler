package com.interview.hashing;

import java.util.*;

public class FindTwoNumberDiffSum {
	
	//sum = a + b
	//key => sum - a
	//diff = a - b
	//key => diff + a 
	
	public static Map<String, int[]> getTwoNumSumAndDiff(int[] a, int targetDiff, int targetSum){
		
		Map<Integer, Integer> map = new HashMap<>();
		boolean isSumNumFound = false;
		boolean isDiffNumFound = false;
		Map<String, int[]> ans = new HashMap<>();
		
		for(int i=0; i<a.length; ++i){
			
			if(isSumNumFound && isDiffNumFound){
				return ans;
			} else {
				if(!isSumNumFound && map.get(targetSum - a[i]) != null){
					int[] sumNum = new int[]{map.get(targetSum - a[i]), i};
					isSumNumFound = true;
					ans.put("targetSum", sumNum);
				}
				
				if(!isDiffNumFound && map.get(a[i] - targetDiff) != null){
					int[] diffNum = new int[]{map.get(a[i] - targetDiff), i};
					isDiffNumFound = true;
					ans.put("targetDiff", diffNum);
				}
			}			
			
			map.put(a[i], i);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Input: arr[] = {5, 20, 3, 2, 50, 80}, n = 78
				Output: Diff Pair Found: (2, 80)
				
				Output : Target Sum => 52  (2, 50)
				*/
		
		int[] arr = {5, 20, 3, 2, 50, 80};
		int targetDiff = 78;
		int targetSum = 52;
		
		Map<String, int[]> ans = getTwoNumSumAndDiff(arr, targetDiff, targetSum);
		
		System.out.println(Arrays.toString(ans.get("targetDiff")));
		System.out.println(Arrays.toString(ans.get("targetSum")));
	}

}
