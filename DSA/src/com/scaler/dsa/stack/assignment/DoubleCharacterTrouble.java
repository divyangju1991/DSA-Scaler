package com.scaler.dsa.stack.assignment;

import java.util.Stack;

public class DoubleCharacterTrouble {
	
	public String solve(String A) {
        Stack<Character> s = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < A.length(); i++){
            if(s.empty()){
                s.push(A.charAt(i));
            }
            else if((char)s.peek() == A.charAt(i)){
                s.pop();
            }else{
                s.push(A.charAt(i));
            }
        }
        while(!s.empty()){
            str.append(s.pop());
        }
        return str.reverse().toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
