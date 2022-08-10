package com.scaler.dsa.hashing.assignment;

import java.util.HashMap;
import java.util.Map;

public class ReplicatingSubstring {
	
	public int solve(int reqLen, String s) {

        int n = s.length();

        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            if(map.get(s.charAt(i)) == null){
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){

            if(entry.getValue() % reqLen != 0){
                return -1;
            }
        }

        return 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reqLen = 2;
		String s = "bbaabb";

		System.out.println(new ReplicatingSubstring().solve(reqLen, s));
	}

}
