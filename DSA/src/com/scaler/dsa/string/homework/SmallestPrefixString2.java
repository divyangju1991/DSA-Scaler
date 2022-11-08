package com.scaler.dsa.string.homework;

public class SmallestPrefixString2 {

	public String smallestPrefix(String s1, String s2) {
        StringBuilder ans = new StringBuilder();
        int n = s1.length();
        ans.append(s1.charAt(0));
        
        for(int i=1; i<n && s1.charAt(i) < s2.charAt(0); i++) {
        	ans.append(s1.charAt(i));
        }
        ans.append(s2.charAt(0));
        return ans.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SmallestPrefixString2().smallestPrefix("tom", "riddlessss"));//
		System.out.println(new SmallestPrefixString2().smallestPrefix("wixjzniiub", "ssdfodfgap"));
		System.out.println(new SmallestPrefixString2().smallestPrefix("twvvsl", "wtcyawv"));
		
	}

}
