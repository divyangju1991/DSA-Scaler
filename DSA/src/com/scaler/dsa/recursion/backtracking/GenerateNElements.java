package com.scaler.dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Divyang
 * Generating all permutations N distinct elements
 * 
 */
public class GenerateNElements {

	public void gen(int[] input, int index, List<List<Integer>> ans){
		
		if(index == input.length){
		
			List<Integer> sub = Arrays.stream(input).boxed().collect(Collectors.toList());
			ans.add(sub);
			return;
		}
		
		//Main Concept is swap with each other with all combinations 
		//After complete it do again swap to get original input array
		//123  - 22
		//132  - 21
		//123  - 21
		//Done
		//213  - 10
		//231  - 21
		//213  - 21
		//123  - 10
		//Done
		//321  - 20
		for(int i=index; i<input.length; i++){
			swap(input, i, index);
			gen(input, index+1, ans);
			swap(input, i, index);
		}
	}
	
	public void swap(int a[], int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = new int[]{1,2,3};
		
		List<List<Integer>> ans = new ArrayList<>();
		
		new GenerateNElements().gen(input, 0, ans);
	
		//(1,2,3) (1,3,2) (2,1,3) (2,3,1) (3,1,2) (3,2,1)
		System.out.println(ans);
		
		System.out.println("############################");

		
        input = new int[]{1,2,3,4};
        ans = new ArrayList<>();
		
		new GenerateNElements().gen(input, 0, ans);
	
		//(1,2,3) (1,3,2) (2,1,3) (2,3,1) (3,1,2) (3,2,1)
		System.out.println(ans);
	}

}
