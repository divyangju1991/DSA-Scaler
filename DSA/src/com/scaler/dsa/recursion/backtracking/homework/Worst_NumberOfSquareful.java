package com.scaler.dsa.recursion.backtracking.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Worst_NumberOfSquareful {
	
	class Answer{
        int count = 0;
    }

    private void squareCount(ArrayList<Integer> A, int i, Worst_NumberOfSquareful.Answer ans){

            int n = A.size();
            if(n == 1){
            	return;
            }

            if(i == n-1){
            	if(isSquere(A.get(i)+A.get(i-1))){
            		ans.count += 1;
            	}
                return; 
            }

            for(int k=i; k<n; k++){
                if(i != k && A.get(i) == A.get(k)){
                    continue;
                }
                swap(A, i, k);
                if( (i == 0) || (i>0 && isSquere(A.get(i)+A.get(i-1)))){
                    squareCount(A, i+1, ans);
                }
                swap(A, i, k);
            }
    }

    private void swap(ArrayList<Integer> A, int i, int k){
        int tmp = A.get(i);
        A.set(i, A.get(k));
        A.set(k, tmp);
    }

    private boolean isSquere(int num){
        double sqrt = Math.sqrt(num);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }

    public int solve(ArrayList<Integer> A) {
    	Collections.sort(A);
    	Worst_NumberOfSquareful.Answer ans = new Worst_NumberOfSquareful().new Answer();
        squareCount(A, 0, ans);

        return ans.count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(36229, 1020, 69, 127, 162, 127));
		
		System.out.println(new Worst_NumberOfSquareful().solve(A));
		
		A = new ArrayList<>(Arrays.asList(16777, 1179, 265, 135, 90, 135, 34));
			
		System.out.println(new Worst_NumberOfSquareful().solve(A));
	}

}
