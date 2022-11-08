package com.scaler.dsa.queue.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class NIntegers123 {
	
	public ArrayList<Integer> solve(int A) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
    
    
        res.add(1);
        res.add(2);
        res.add(3);
    
        if(A<=3){
            ArrayList<Integer> temp = new ArrayList<Integer>();;
            for(int i=0;i<A;i++){
                temp.add(res.get(i));
            }
            return temp;
        }
    
        while(true){
            int t=queue.peek();
            queue.poll();
            String str= ""+t;
        
            res.add(Integer.parseInt(str+"1"));
            if(res.size()==A)
                break;
            queue.add(Integer.parseInt(str+"1"));
        
            res.add(Integer.parseInt(str+"2"));
            if(res.size()==A)
                break;
            queue.add(Integer.parseInt(str+"2"));
        
            res.add(Integer.parseInt(str+"3"));
            if(res.size()==A)
                break;
            queue.add(Integer.parseInt(str+"3"));
        }

        Collections.sort(res);
    
        return res;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new NIntegers123().solve(9));
	}

}
