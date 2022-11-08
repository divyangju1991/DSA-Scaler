package com.scaler.dsa.queue.assignment;

import java.util.ArrayDeque;
import java.util.Deque;

public class PerfectNumbers {
	
	private String getAddReverseString(String s){

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        return s+sb.toString();
    }

    public String solve(int A) {

        Deque < String > nums = new ArrayDeque < String > ();
        nums.add("1");
        nums.add("2");
        String ans = "";

        for(int i = 0; i < A; i++){
            String tmp = nums.getFirst();
            nums.removeFirst();
            ans = getAddReverseString(tmp);
            nums.add(tmp+"1");
            nums.add(tmp+"2");
        }

        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PerfectNumbers().solve(1));
		System.out.println(new PerfectNumbers().solve(2));
		System.out.println(new PerfectNumbers().solve(3));
		System.out.println(new PerfectNumbers().solve(4));
	}

}
