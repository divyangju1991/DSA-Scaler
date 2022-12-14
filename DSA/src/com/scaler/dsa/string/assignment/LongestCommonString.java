package com.scaler.dsa.string.assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonString {
	
	private int getMinStrLen(ArrayList<String> list) {
		
		int n = list.size();
		int minStrLen = Integer.MAX_VALUE; 
		
		for(int i=0; i<n; i++){
			minStrLen = Math.min(minStrLen, list.get(i).length());
		}
		
		return minStrLen;
	}
	
	public String longestCommonPrefix(ArrayList<String> list) {
		int listSize = list.size();
		int minStrLen = getMinStrLen(list);
		StringBuilder sb = new StringBuilder();
		
		for(int j=0; j<minStrLen; j++){
			char ch = list.get(0).charAt(j);
			for(int i=1; i<listSize;i++){
				if(ch != list.get(i).charAt(j)){
					return sb.toString();
				}
			}
			sb.append(ch);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LongestCommonString().longestCommonPrefix(new ArrayList<>(Arrays.asList("abcdefgh", "aefghijk", "abcefgh"))));
		
		System.out.println(new LongestCommonString().longestCommonPrefix(new ArrayList<>(Arrays.asList("abab", "ab", "abcd"))));
	}

}
