package com.scaler.dsa.recursion.backtracking.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Worst_MinimumSwaps {

private void updateindex(int index[], int a,
                     int ai, int b, int bi)
{
    index[a] = ai;
    index[b] = bi;
}

private void swap(ArrayList<Integer> input, int i, int j){
	int temp = input.get(i);
	input.set(i, input.get(j));
	input.set(j, temp);
}
 
// This function returns minimum number
// of swaps required to arrange
// all elements of arr[i..n] become arranged
private int minSwapsUtil(ArrayList<Integer> input, ArrayList<Integer> pairs,
                     int index[], int i, int n)
{
    // If all pairs processed so
    // no swapping needed return 0
    if (i > n)
    return 0;
 
    // If current pair is valid so
    // DO NOT DISTURB this pair
    // and move ahead.
    if (pairs.get(input.get(i)) == input.get(i+1))
    return minSwapsUtil(input, pairs, index, i + 2, n);
 
    // If we reach here, then arr[i] and
    // arr[i+1] don't form a pair
 
    // Swap pair of arr[i] with arr[i+1]
    // and recursively compute minimum swap
    // required if this move is made.
    int one = input.get(i+1);
    int indextwo = i + 1;
    int indexone = index[pairs.get(input.get(i))];
    int two = input.get(index[pairs.get(input.get(i))]);
    swap(input, i+1, indexone);
    updateindex(index, one, indexone, two, indextwo);
    int a = minSwapsUtil(input, pairs, index, i + 2, n);
 
    // Backtrack to previous configuration.
    // Also restore the previous
    // indices, of one and two
    swap(input, i+1, indexone);
    updateindex(index, one, indextwo, two, indexone);
    one = input.get(i);
    indexone = index[pairs.get(input.get(i + 1))];
 
    // Now swap arr[i] with pair of arr[i+1]
    // and recursively compute minimum swaps
    // required for the subproblem
    // after this move
    two = input.get(index[pairs.get(input.get(i + 1))]);
    indextwo = i;
    swap(input, i, indexone);
    updateindex(index, one, indexone, two, indextwo);
    int b = minSwapsUtil(input, pairs, index, i + 2, n);
 
    // Backtrack to previous configuration. Also restore
    // the previous indices, of one and two
    swap(input, i, indexone);
    updateindex(index, one, indextwo, two, indexone);
 
    // Return minimum of two cases
    return 1 + Math.min(a, b);
}
 


    public int solve(int x, ArrayList<Integer> input, ArrayList<ArrayList<Integer>> pairs) {
        // To store indices of array elements
        
        ArrayList<Integer> pairIn1D = new ArrayList<>();
        pairIn1D.add(0);
        
        ArrayList<Integer> input2 = new ArrayList<>();
        input2.add(0);
        
        for(int value : input){
        	input2.add(value);
        }

        for(int i=0; i< pairs.size(); i++){
            for(int val : pairs.get(i)){
                  pairIn1D.add(val);  
            }

        }
        int m = pairIn1D.size();
        int n = m / 2;
        
        int index[] = new int[2 * n + 1];
        
        for (int i = 1; i < 2 * n; i++)
            index[input.get(i)] = i;

        return minSwapsUtil(input2, pairIn1D, index, 1, 2 * n);
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int n = 3;
    	
    	ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 5, 6, 4, 1, 2));
    	
    	
    	ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
    	pairs.add(new ArrayList<>(Arrays.asList(1,3)));
    	pairs.add(new ArrayList<>(Arrays.asList(2,6)));
    	pairs.add(new ArrayList<>(Arrays.asList(4,5)));
    	
    			
    	System.out.println(new Worst_MinimumSwaps().solve(n, input, pairs));
    	

	}
}
