package com.scaler.dsa.string.homework;

public class ClosestPalindrome {
	
	public String solve(String s) {

        int  i=0;
        int n = s.length();
        int j=n-1;
        int count = 0;

        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                ++count;
            }
            ++i;
            --j;
        }

        boolean isPalindromByChange1Char = ((count == 0 & (n % 2 == 1)) || (count == 1));

        return (isPalindromByChange1Char) ? "YES" : "NO";
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ClosestPalindrome().solve("abbba"));
		
		System.out.println(new ClosestPalindrome().solve("adaddb"));
	}

}
