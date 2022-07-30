package com.scaler.dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Divyang
 * Generate All possible array with size 3. which have values 0 or 1
 *
 */
public class Generate2Pairs {
	
	public void genPairs(int[] a, int idx, List<int[]> ans) {
		
		if(idx == a.length){
			ans.add(a.clone());
			return;
		}
		
		//First reaches to 3
		//due to recursion stack called to fill 1 ad value index 2 to 1 and both 1 and 2
		a[idx] = 0;
		genPairs(a, idx+1, ans);

		//1 fill as 0th index and other have 0 values
		//again due to stack fill 1 as value as done as above
		a[idx] = 1;
		genPairs(a, idx+1, ans);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 3;
		int[] arr = new int[size];
		
		List<int[]> ans = new ArrayList<int[]>();
		new Generate2Pairs().genPairs(arr, 0, ans);
		
		for(int[] array : ans){
			System.out.println(Arrays.toString(array));
		}
		
	}

}
