package com.scaler.dsa.trie.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ContactFinder {
	
	class TrieNode
	{
	    HashMap<Character,TrieNode> child;
	    boolean isLast;
	    char data;
	    int count = 0;
	  
	    public TrieNode(char data)
	    {
	        child = new HashMap<Character,TrieNode>();
	  
	        for (char i = 'a'; i <= 'z'; i++)
	             child.put(i,null);
	  
	        isLast = false;
	        this.data = data;
	    }
	}
	  

	    TrieNode root;
	    List<Integer> numberOfContacts = new ArrayList<>();
	    int matchCount=0;
	  
	    public void insertIntoTrie(int[] a, String contacts[])
	    {
	        root = new TrieNode(' ');
	        int n = contacts.length;
	        for (int i = 0; i < n; i++)
	        {
	            if(a[i] == 0){
	                insert(contacts[i]);
	            }
	            
	        }
	    }
	  
	    public void insert(String s)
	    {
	        int len = s.length();
	        TrieNode itr = root;
	        for (int i = 0; i < len; i++)
	        {
	            
	            TrieNode nextNode = itr.child.get(s.charAt(i));
	            if (nextNode == null)
	            {
	                nextNode = new TrieNode(s.charAt(i));
	                itr.child.put(s.charAt(i),nextNode);
	            }
	            itr.count = ++itr.count;
	            itr = nextNode;
	        }
	        itr.isLast = true;
	    }
	  
	    public void displayContactsUtil(TrieNode curNode,
	                                   String prefix)
	    {
	    	matchCount = curNode.count;
	    	/*
	        if (curNode.isLast)
	            ++matchCount;
	  
	        for (char i = 'a'; i <= 'z'; i++)
	        {
	            TrieNode nextNode = curNode.child.get(i);
	            if (nextNode != null)
	            {
	                displayContactsUtil(nextNode, prefix + i);
	            }
	        }
	        */
	    }

	    void displayContacts(String str)
	    {
	        TrieNode prevNode = root;
	  
	        String prefix = "";
	        int len = str.length();
	  
	        int i;
	        matchCount = 0;  
	        for (i = 0; i < len; i++)
	        {
	            prefix += str.charAt(i);
	  
	            char lastChar = prefix.charAt(i);
	  
	            TrieNode curNode = prevNode.child.get(lastChar);
	  
	            if (curNode == null)
	            {
	                i++;
	                break;
	            }            
	             
	            if(str.equals(prefix)){
	            	displayContactsUtil(curNode, prefix);
	            }	            
	  
	            prevNode = curNode;
	        }

	        numberOfContacts.add(matchCount);
	    }

	    public int[] solve(int[] a, String[] contacts) {        
	  
	        insertIntoTrie(a, contacts);
	        for(int i=0; i<contacts.length; ++i){

	            if(a[i] == 1){
	                String query = contacts[i];
	                displayContacts(query);
	            }
	        }       

	        return numberOfContacts.stream().mapToInt(i->i).toArray();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * A = [0, 0, 1, 1]
B = ["hack", "hacker", "hac", "hak"]
Input 2:

A = [0, 1]
B = ["abcde", "abc"]
		 */
		
		int[] a = {0, 0, 1, 1};
		String[] b = {"hack", "hacker", "hac", "hak"};
		System.out.println(Arrays.toString(new ContactFinder().solve(a, b)));
		
		
		int[] c = {0, 1};
		String[] d = {"abcde", "abc"};
		
		
	}

}
