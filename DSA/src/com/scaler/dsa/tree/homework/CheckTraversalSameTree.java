package com.scaler.dsa.tree.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class CheckTraversalSameTree {
	
	int search(ArrayList<Integer> inOrder, int strt, int end, int value) 
    { 
        int i = 0;
        for (i = strt; i < end; i++) 
        { 
            if(inOrder.get(i).intValue() == value) 
                return i; 
        }

        return i; 
    }

    private void printPost(ArrayList<Integer> in, ArrayList<Integer> pre, ArrayList<Integer> post, int inStrt, int inEnd, AtomicInteger preIndex, AtomicInteger postIndex, AtomicInteger res) {

    	System.out.println("0th preIndex : "+ preIndex + ", postIndex : "+ postIndex);
    	
        if (inStrt > inEnd)  
            return;         

        int inIndex = search(in, inStrt, inEnd, pre.get(preIndex.getAndIncrement())); 
        System.out.println("1st preIndex : "+ preIndex + ", postIndex : "+ postIndex);

        printPost(in, pre, post, inStrt, inIndex - 1, preIndex, postIndex, res); 
        System.out.println("2nd preIndex : "+ preIndex + ", postIndex : "+ postIndex);

        printPost(in, pre, post, inIndex + 1, inEnd, preIndex, postIndex, res); 
    
        System.out.println("3rd preIndex : "+ preIndex + ", postIndex : "+ postIndex);
        if(in.get(inIndex).intValue() != post.get(postIndex.getAndIncrement()).intValue()) {
       
            res.set(0);
        }
        System.out.println("4th preIndex : "+ preIndex + ", postIndex : "+ postIndex);
    } 

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {

        int n = A.size();
    
        AtomicInteger preIndex = new AtomicInteger(); 
        AtomicInteger postIndex = new AtomicInteger();
        AtomicInteger res = new AtomicInteger(1);
    
        printPost(B, A, C, 0, n-1, preIndex, postIndex, res);

        return res.get();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CheckTraversalSameTree().solve(new ArrayList<>(Arrays.asList(13, 33, 41, 11, 49, 48, 23 )), new ArrayList<>(Arrays.asList(41, 33, 11, 13, 48, 49, 23)), new ArrayList<>(Arrays.asList(41, 11, 33, 48, 23, 49, 13))));
	}

}
