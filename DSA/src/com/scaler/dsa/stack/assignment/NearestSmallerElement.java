package com.scaler.dsa.stack.assignment;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallerElement {
	
	public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> anslst = new ArrayList<>();
        for(int i = 0; i < A.size(); i++){
            if(s.empty()){
                s.push(A.get(i));
                anslst.add(-1);
            }else{
                if(s.peek() < A.get(i)){
                    anslst.add(s.peek());
                    s.push(A.get(i));
                }else if(s.peek() == A.get(i)){
                    s.pop();
                    if(s.empty()){
                        anslst.add(-1);
                    }else{
                        anslst.add(s.peek());
                    }
                    s.push(A.get(i));
                }
                else{
                    while(!s.empty() && s.peek() >= A.get(i)){
                        s.pop();
                    }
                    if(s.empty()){
                        anslst.add(-1);
                    }else{
                        anslst.add(s.peek());
                    }
                    s.push(A.get(i));
                    
                }
            }
        }
        return anslst;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
