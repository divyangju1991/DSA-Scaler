package com.scaler.dsa.string.homework;

public class CountA {
	
	public int solve(String s) {
        int n = s.length();
        int countOfa = 0;

        for(int i=0; i<n; i++){
            if('a' == s.charAt(i)){
                ++countOfa;
            }
        }
        
        int subStringLen = countOfa*(countOfa+1)/2;
        return subStringLen;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new CountA().solve("aab"));
		
		System.out.println(new CountA().solve("bcbc"));
	}

}
