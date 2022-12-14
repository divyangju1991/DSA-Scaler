package com.scaler.dsa.string.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class WorstLongestCommonString {
	
	public String longestCommonPrefix(ArrayList<String> list) {

		int n = list.size();
		StringBuilder sb = new StringBuilder(); 
		
		for(int i=0; i<n; i++){	
			int l=0; 
			int r=0;
			int sum = 0;
			sb.append(list.get(i));
			String input = sb.toString();
			int len = input.length();
			char[] in = input.toCharArray();
			int[] z = new int[len];

			for(int j=1; j<len; j++){
				if(j>r){
					l=r=j;
					while(r<len && in[r-1] == in[r]){
						r++;
					}
					z[j]=r-l;
					r--;
				} else {
					int k=j-l;
					
					if(z[k]<r-j+1){
						z[j]=z[k];
					} else {
						l=j;
						while(r<len && in[r-l]==in[r]){
							r++;
						}
						
						z[j]=r-l;
						r--;
					}
				}
				
			}
			int test = 0;
			if(test == 1){};
		}

		return "";

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WorstLongestCommonString().longestCommonPrefix(new ArrayList<>(Arrays.asList("abcdefgh", "aefghijk", "abcefgh")));
		
		new WorstLongestCommonString().longestCommonPrefix(new ArrayList<>(Arrays.asList("abab", "ab", "abcd")));
	}

}
