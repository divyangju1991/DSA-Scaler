package com.scaler.dsa.stack.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RedundantBraces {
	
	public int braces(String s) {
        List<Character> list = new ArrayList<>(Arrays.asList('+', '-', '*', '/'));
        char openingBracket = '(';
        char closingBracket = ')';
        Stack<Character> stack = new Stack<Character>();
        int n = s.length();

        for(int i=0; i<n; i++){

            if(s.charAt(i) == openingBracket || list.contains(s.charAt(i))){
                stack.push(s.charAt(i));
            }

            if(s.charAt(i) == closingBracket && stack.peek() == openingBracket){
                return 1;
            }

            if(s.charAt(i) == closingBracket){
                while(stack.peek() != openingBracket){
                    stack.pop();
                }
                stack.pop();
            }

        }
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new RedundantBraces().braces("((a+b))"));
		System.out.println(new RedundantBraces().braces("(a+(a+b))"));
	}

}
