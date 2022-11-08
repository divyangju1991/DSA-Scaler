package com.scaler.dsa.trie.assignment;

public class SpellChecker {
	
class TrieNode{
		
		TrieNode trie[];
		boolean isEnd;
		
		public TrieNode(){
			trie = new TrieNode[256];
		}		
	}
	
	private void insertTrieNode(TrieNode root, String s){
		
		TrieNode tmp = root;
		
		for(int i=0; i<s.length(); ++i){
			
			if(tmp.trie[s.charAt(i)] ==null){
				tmp.trie[s.charAt(i)] = new TrieNode();
			}
				
			tmp = tmp.trie[s.charAt(i)];
		}
		
		tmp.isEnd = true;
	}
	
	private boolean isPresent(TrieNode root, String key){
		
		for(int i=0; i<key.length(); ++i){
			
			if(root.trie[key.charAt(i)] == null){
				return false;
			}
			
			root = root.trie[key.charAt(i)];
		}
		
		return root.isEnd;
	}
	
	public int[] solve(String[] str, String[] word) {
		
		TrieNode root = new TrieNode();
		int[] ans = new int[word.length];
		
		for(int i=0; i<str.length; ++i){
			insertTrieNode(root, str[i]);
		}
		
		for(int i=0; i<word.length; ++i){			
			ans[i] = isPresent(root, word[i]) ? 1 : 0;
		}
		
		return ans;
	}
}
