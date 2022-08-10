package com.scaler.dsa.recursion.backtracking.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LetterPhone {
	
	private void genKeypadChars(String digits, int i, StringBuilder sb, Map<Character,String> allKeyboardPairs, ArrayList<String> ans){
		
		if(i == digits.length()){
			ans.add(sb.toString());
			return;
		}
		
		String curr = allKeyboardPairs.get(digits.charAt(i));
		for(int k=0; k<curr.length();k++){
			sb.append(curr.charAt(k));
			genKeypadChars(digits, i+1, sb, allKeyboardPairs, ans);
			sb.deleteCharAt(sb.length()-1);
		}
	}
	
	 private Map<Character,String> genAllKeyboardPairs(){
		 Map<Character,String> allKeyboardPairs = new HashMap<Character, String>();
		 
		 allKeyboardPairs.put('0', "0");
		 allKeyboardPairs.put('1', "1");
		 allKeyboardPairs.put('2', "abc");
		 allKeyboardPairs.put('3', "def");
		 allKeyboardPairs.put('4', "ghi");
		 allKeyboardPairs.put('5', "jkl");
		 allKeyboardPairs.put('6', "mno");
		 allKeyboardPairs.put('7', "pqrs");
		 allKeyboardPairs.put('8', "tuv");
		 allKeyboardPairs.put('9', "wxyz");
		 
		 return allKeyboardPairs;
		 
	 }
	
	 public ArrayList<String> letterCombinations(String digits) {
		 
		 ArrayList<String> ans = new ArrayList<>();
		 if(digits.length() == 0){
			 return ans;
		 }
		 
		 Map<Character,String> allKeyboardPairs = genAllKeyboardPairs();
		 genKeypadChars(digits, 0, new StringBuilder(), allKeyboardPairs, ans);
		 
		 return ans;
	 }
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LetterPhone().letterCombinations("23"));
		
	}

}
