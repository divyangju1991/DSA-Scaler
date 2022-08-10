package com.scaler.dsa.recursion.backtracking.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfSquareful {
	
	private int squareCount(int res, ArrayList<Integer> A, List<Integer> tempList,  boolean[] used, Map<String,Boolean> map){

            int n = A.size();
            if(n == 1){
                return 0;
            }
            
            if(tempList.size() == n){
            	if(map.get(tempList.toString()) == null){
            		map.put(tempList.toString(), true);
            		++res;
            	}            	
                return res;
            }else{
            	for(int i = 0; i < n; i++){
                    if(used[i] 
                       || i > 0 && A.get(i) == A.get(i-1) && !used[i - 1]
                       || tempList.size() > 0 && !isSquere(tempList.get(tempList.size() - 1) + A.get(i))) {
                    	continue;
                    }
                    used[i] = true;
                    tempList.add(A.get(i));
                    res = squareCount(res, A, tempList,  used, map);
                    used[i] = false;
                    tempList.remove(tempList.size() - 1);
            	}
            }
            return res;
    }

    private void swap(ArrayList<Integer> A, int i, int k){
        int tmp = A.get(i);
        A.set(i, A.get(k));
        A.set(k, tmp);
    }

    private boolean isSquere(int x){
    	return (Double)Math.sqrt(x) == (int)Math.sqrt(x);
    }

    public int solve(ArrayList<Integer> A) {
    	Collections.sort(A);
    	Map<String,Boolean> map = new HashMap<>();
        return squareCount(0, A, new ArrayList<Integer>(), new boolean[A.size()], map);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(16777, 1179, 265, 135, 90, 135, 34));
		
		System.out.println(new NumberOfSquareful().solve(A));
		
		A = new ArrayList<>(Arrays.asList(36229, 1020, 69, 127, 162, 127));
		
		System.out.println(new NumberOfSquareful().solve(A));
		
	}

}
