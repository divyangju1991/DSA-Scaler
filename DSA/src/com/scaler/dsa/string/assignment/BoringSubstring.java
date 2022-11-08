package com.scaler.dsa.string.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BoringSubstring {
	
	private List<List<Character>> sortString(String s, int n){
		 
		 List<List<Character>> list = new ArrayList<List<Character>>();
		 List<Character> odd = new ArrayList<>();
		 List<Character> even = new ArrayList<>();
		 
		 for(int i=0; i<n; i++){
			 
			 if(s.charAt(i) % 2 == 0){
				 even.add(s.charAt(i));
			 } else {
				 odd.add(s.charAt(i));
			 }
		 }

        Collections.sort(odd);
		Collections.sort(even);
		 
		 list.add(odd);
		 list.add(even);
		 
		 return list;
	 }
	
	 public int solve(String s) {
		 
		 int n = s.length();
		 
		 if(s == null || s.trim().isEmpty() || n == 1){
			 return 1;
		 }
		 
		 List<List<Character>> list = sortString(s, n);
		 
		 List<Character> odd = list.get(0);
		 List<Character> even = list.get(1);
		 
		 
		 if(Math.abs(odd.get(0) - even.get(even.size()-1)) != 1){
			 return 1;
		 }
		 
		 if(Math.abs(odd.get(odd.size()-1) - even.get(0)) != 1){
			 return 1;
		 }
		 
		 return 0;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new BoringSubstring().solve("bac"));
		System.out.println(new BoringSubstring().solve("abcd"));
		System.out.println(new BoringSubstring().solve("gihhfjjejgh"));
	}

}
