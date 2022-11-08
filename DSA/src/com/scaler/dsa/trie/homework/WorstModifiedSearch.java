package com.scaler.dsa.trie.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class WorstModifiedSearch {
	
	Set<Character> firstKeys;
	TrieNode firstNode;
	
class TrieNode{
		
	    char data;
		Map<Character, TrieNode> children = new HashMap<>();
		boolean isEnd;
		
		public TrieNode(char c){
			this.data = c;
		}
		
	}

	private boolean search(TrieNode root, String word) {
		TrieNode node = root;
		for (char ch : word.toCharArray()) {
			if (!node.children.containsKey(ch)) 
				return false;		        
			node = node.children.get(ch);
		}
		return node.isEnd;
	}
	
	private void insertTrieNode(TrieNode root, String word){
		
		if (search(root, word) == true) {
			return;
		}
		
		TrieNode node = root;
		for (char ch : word.toCharArray()) {
		    if (!node.children.containsKey(ch)) 
		        node.children.put(ch, new TrieNode(ch));			         			    
		    node = node.children.get(ch);	
		}
		node.isEnd = true;
	}
	
	private boolean isExact1Diff(TrieNode node, String word, int idx, int flag){
		
		boolean ans = false;
		int n = word.length();
			
		if(idx == n)
			return (flag == 1 && node.isEnd);
				
		char letter = word.charAt(idx);
		
		if(flag == 0){
			
			char firstKey = letter;
				
			if(node.children.get(firstKey) != null){
				ans = ans || isExact1Diff(node.children.get(firstKey), word, idx+1, flag);
			} else {
				
				if(idx == n-1){
					firstKey = node.children.keySet().iterator().next();
					return node.children.get(firstKey).isEnd;
				}
				
				TrieNode prevNode = null;
				for(char tmpFirstKey : firstKeys ){
					node = firstNode.children.get(tmpFirstKey);
					while(!node.isEnd && !node.children.containsKey(letter)){
						firstKey = node.children.keySet().iterator().next();
						prevNode = node;
						node = node.children.get(firstKey);
					} 
				}
				
				if(!node.children.containsKey(letter) && word.charAt(0) == letter){
					prevNode = firstNode;
					firstKey = firstKeys.stream().findFirst().get();
				}
				
				ans = ans || isExact1Diff(prevNode.children.get(firstKey), word, idx+1, 1-flag);
			}
			
			
		} else {
			if(node.children.containsKey(letter)){
				ans = ans || isExact1Diff(node.children.get(letter), word, idx+1, flag);
			}
		}
		
		return ans;
	}
    

    public String solve(String[] str, String[] words) {

    	TrieNode root = new TrieNode(' ');
    	firstNode = root;
		StringBuilder sb = new StringBuilder();
		firstKeys = new LinkedHashSet();
		
		for(int i=0; i<str.length; ++i){
			insertTrieNode(root, str[i]);
			firstKeys.add(str[i].charAt(0));
		}
		
		for(int i=0; i<words.length; ++i){			
			sb.append(isExact1Diff(root, words[i], 0, 0) ? "1" : "0");
		}
		
		System.out.println("Final Answer : " + sb.toString());
		
		return sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorstModifiedSearch searchObj = new WorstModifiedSearch();
		String[] a = new String[]{"data", "circle", "cricket"};
		String[] b = new String[]{"date", "circel", "crikket", "data", "circl"};
		System.out.println(searchObj.solve(a, b));
		
		a = new String[]{"hello", "world"};
		b = new String[]{"hella", "pello", "pella"};
		System.out.println(searchObj.solve(a, b));
	}

}
