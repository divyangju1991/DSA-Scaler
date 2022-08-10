package com.scaler.dsa.hashing.assignment;

public class WindowString {
	
	public String minWindow(String s, String t) {
		
		String result = "";

        int n = s.length(), m = t.length();  
        
        if(m>n) {
            return result;
        }
        
        int freq1[] = new int[128]; /*creating a frequency array to store the 
                                    frequencies of the characters in string t*/
        int freq2[] = new int[128]; /*creating a frequency array to store the 
                                    frequencies of the characters in string s*/
        for (char c : t.toCharArray()) {
            freq1[c]++;
        }
        int l = 0, len = n+1; 
        int cnt = 0;
        //This part uses "2 pointer method."
        for (int i = 0; i < n ; i++){
            char temp = s.charAt(i);
            freq2[temp]++;
            //if a character is present in string t we increment the count of cnt variable.
            if (freq1[temp]!=0 && freq2[temp]<=freq1[temp]) {
                cnt++; 
            }
            /*if we match all the characters present in string t, 
            we try to find the minimum window possible*/
            if (cnt==m) {
                /*if any character is occuring more than the required times, we try to remove it
                from the starting and also try to remove the unwanted characters that are 
                not a part of string t from the starting. We check the remainder string if it 
                can become the smallest window.*/
                while (freq2[s.charAt(l)]>freq1[s.charAt(l)] || freq1[s.charAt(l)]==0) { 
                    if (freq2[s.charAt(l)]>freq1[s.charAt(l)]) { 
                        freq2[s.charAt(l)]--; 
                    }
                    l++; 
                }
                //check if this can become the smallest window and update the result accordingly.
                if (len > i-l+1) { 
                    len = i-l+1;
                    result = s.substring(l,l+len);
                } 
            } 
        } 
        return result;
   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new WindowString().minWindow("ADOBECODEBANC", "ABC"));
	}

}
