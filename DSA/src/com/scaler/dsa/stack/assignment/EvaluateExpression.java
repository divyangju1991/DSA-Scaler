package com.scaler.dsa.stack.assignment;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpression {
	
	public int evalRPN(ArrayList<String> A) {
        Stack<Integer> s = new Stack<Integer>();
        int ans = 1,a=0,b=0;
       
        
        for(int i = 0; i < A.size(); i++){
            if(A.get(i).equalsIgnoreCase("+") || A.get(i).equalsIgnoreCase("-") || A.get(i).equalsIgnoreCase("/") ||A.get(i).equalsIgnoreCase("*")){
               
                b = s.pop();
                a = s.pop();
                
                if(A.get(i).equalsIgnoreCase("+")){
                    ans = a + b;
                }else if(A.get(i).equalsIgnoreCase("-")){
                    ans = a - b;
                }else if(A.get(i).equalsIgnoreCase("/")){
                    ans = a / b;
                }else if(A.get(i).equalsIgnoreCase("*")){
                    ans = a * b;
                }
                s.push(ans);
            }else{
                s.push(new Integer(A.get(i)));
            }
        }
        return s.peek();
    }

}
