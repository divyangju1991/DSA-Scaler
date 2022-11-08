package com.scaler.dsa.string.assignment;

public class MakeStringPalindrome2 {
	
	public int solve(String A) {
        String s = new String(A);
        StringBuilder sb = new StringBuilder(A);
        s += sb.reverse();
        int lps[];
        lps = computeLPS(s);
        return Math.max(A.length() - lps[s.length() - 1], 0);
    }
	
    public int[] computeLPS(String s) {
        int j = 0, i = 1;
        int lps[] = new int[s.length()];
        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                lps[i] = ++j;
                i++;
            } else {
                if (j > 0) {
                    j = lps[j - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new MakeStringPalindrome2().solve("abc"));
		System.out.println(new MakeStringPalindrome2().solve("bb"));
	}

}
