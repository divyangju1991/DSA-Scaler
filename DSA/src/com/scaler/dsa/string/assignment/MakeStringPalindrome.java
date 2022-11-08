package com.scaler.dsa.string.assignment;

public class MakeStringPalindrome {
	
	public int solve(String str) {
        
        int n = str.length();
        int left = 0;
        int right = n - 1;
        int added = 0;

        while (left < right) {
            // if left and right characters are same increase
            // left and decrease right pointer
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            }
            // else think of adding some characters at front and
            // start comparing the elements again
            else {
                left = 0;
                added = n - right;
                while (str.charAt(left) == str.charAt(right)) {
                    added--;
                    left++;
                }
                right--;
            }
        }

        return added;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new MakeStringPalindrome().solve("abc"));
		System.out.println(new MakeStringPalindrome().solve("bb"));
	}

}
