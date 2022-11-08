package com.scaler.dsa.stack.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
	
	public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
		
		Stack<Integer> st = new Stack<>();

        for(int i = 0; i < A.size(); i++) {
            int ai = A.get(i);
            while(!st.isEmpty() && ai > A.get(st.peek())) {
                A.set(st.peek(), ai);
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            int stTop = st.peek();
            A.set(stTop, -1);
            st.pop();
        }
        return A;
		
		/*
        ArrayList<Integer> ls = new ArrayList<>();
        if(A.size() == 1){
            ls.add(-1);
            return ls;
        }
        Stack<Integer> s = new Stack<>();
        s.push(A.get(0));
        ls.add(A.get(0));
        
        for(int i = 1; i < A.size(); i++){
        	int j = ls.size();
            while(!s.empty() && s.peek() < A.get(i)){
                s.pop();
                ls.set(--j, A.get(i));
            }
            
            s.push(A.get(i));
            ls.add(-1);
        }
        
        return ls;
        */
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new NextGreater().nextGreater(new ArrayList<>(Arrays.asList(4, 5, 2, 10)))); 
		System.out.println(new NextGreater().nextGreater(new ArrayList<>(Arrays.asList(3, 2, 1))));
		System.out.println(new NextGreater().nextGreater(new ArrayList<>(Arrays.asList(34, 35, 27, 42, 5, 28, 39, 20, 28))));
		System.out.println(new NextGreater().nextGreater(new ArrayList<>(Arrays.asList(48, 38, 42, 39, 28, 6, 49, 34))));
		
	}

}
