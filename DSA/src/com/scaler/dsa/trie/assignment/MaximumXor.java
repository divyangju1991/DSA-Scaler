package com.scaler.dsa.trie.assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumXor {
	
	int maxXor = 0;
	
	class TrieNode {
		  HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
		  public TrieNode() {}
		}

		    public int[] solve(int[] nums) {
		    	int[] ans = maxXoR(nums);
		    	int n = nums.length;
		    	
		    	for(int i=0; i<n; ++i){
		    		
		    		if(nums[i] >= maxXor){
		    			return new int[]{i+1, i+1};
		    		}
		    	}
		    	
		    	return ans;
		    }
		    
		    
		    public int[] maxXoR(int[] nums) {
		        
		        if(nums.length == 1) {
		            return new int[]{1,1};
		        }
		        
		       // Compute length L of max number in a binary representation
		    int maxNum = nums[0];
		    for(int num : nums) maxNum = Math.max(maxNum, num);
		    int L = (Integer.toBinaryString(maxNum)).length();

		    // zero left-padding to ensure L bits for each number
		    int n = nums.length, bitmask = 1 << L;
		    String [] strNums = new String[n];
		    int[] prefix = new int[n+1];
		    Map<Integer, Integer> tmpMap = new HashMap<>();
		    for(int i = 0; i < n; ++i) {
		      strNums[i] = Integer.toBinaryString(bitmask | nums[i]).substring(1);
		      tmpMap.put(nums[i], i+1);
		    }

		    TrieNode trie = new TrieNode();
		    int idx=0;
		    for (String num : strNums) {
		    	++idx;
		      	
		      TrieNode node = trie, xorNode = trie;
		      int currXor = 0;
		      for (Character bit : num.toCharArray()) {
		        // insert new number in trie  
		        if (node.children.containsKey(bit)) {
		          node = node.children.get(bit);
		        } else {
		          TrieNode newNode = new TrieNode();
		          node.children.put(bit, newNode);
		          node = newNode;
		        }

		        // compute max xor of that new number 
		        // with all previously inserted
		        Character toggledBit = bit == '1' ? '0' : '1';
		        if (xorNode.children.containsKey(toggledBit) && currXor < 31) {
		          currXor = (currXor << 1) | 1;
		          xorNode = xorNode.children.get(toggledBit);
		        } else {
		          currXor = currXor << 1;
		          xorNode = xorNode.children.get(bit);
		        }
		      }
		      prefix[idx] = currXor;
		      
		      maxXor = Math.max(maxXor, currXor);		      
		    }
		    
		    Map<Integer, Integer> map = new HashMap<>();
		    map.put(0, 0);
		    int m = prefix.length;
		    int l = 1;
		    int r = 1;
		    
		    for(int i=1; i<m;++i){
		    	
		    	int tmp = prefix[i] ^ maxXor;
		    	
		    	if(tmp == 0 && prefix[i] != 0){
		    		
		    		if(tmpMap.get(maxXor^nums[i-1]) != null){
		    			l = tmpMap.get(maxXor^nums[i-1]);
				    	r = i;
		    		}		    		
		    		map.put(prefix[i], i);
		    	}		    	
		    	else if(map.get(tmp) == null){
		    		map.put(prefix[i], i);
		    	}
		    }
		    
		    return new int[]{l, r};
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] ans = new MaximumXor().solve(new int[]{33, 34, 14, 10, 16, 23, 31, 8, 32});
		System.out.println(Arrays.toString(ans));

		
		
		ans = new MaximumXor().solve(new int[]{1, 4, 3});
		System.out.println(Arrays.toString(ans));
		
		ans = new MaximumXor().solve(new int[]{15, 25, 23});
		System.out.println(Arrays.toString(ans));
		
		ans = new MaximumXor().solve(new int[]{29, 13, 9, 34, 32, 15, 30, 9});
		System.out.println(Arrays.toString(ans));
		
		
	}

}
