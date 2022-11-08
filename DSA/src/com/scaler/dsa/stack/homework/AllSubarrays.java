package com.scaler.dsa.stack.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class AllSubarrays {
	
	public int solve(ArrayList<Integer> list) {

        Stack<Integer> stack = new Stack<Integer>();
        int ans = 0;
        int n = list.size();

        for(int i=0; i<n; i++){

             while(!stack.isEmpty()){
                 ans = Math.max(ans, list.get(stack.peek())^list.get(i));
                 if(list.get(stack.peek()).intValue() > list.get(i).intValue()){
                     break;
                 }
                 stack.pop();
             }
             stack.push(i);   
        }

        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new AllSubarrays().solve(new ArrayList<>(Arrays.asList(9, 8, 3, 5, 7))));
	}

}
