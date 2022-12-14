package com.scaler.dsa.recursion.backtracking.assignment;

public class SequenceProblem {
	
	public int solve(int n) {

        if(n == 2){
            return 2;
        } else if(n==1 || n==0){
            return 1;
        }

        return solve(n-1)+solve(n-2)+solve(n-3)+n;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SequenceProblem().solve(4));
	}

}
