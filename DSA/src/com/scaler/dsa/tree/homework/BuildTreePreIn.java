package com.scaler.dsa.tree.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BuildTreePreIn {
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val){
			this.val = val;
			left = null;
			right = null;
		}
	}
	
	public TreeNode buildTree(ArrayList<Integer> preOrder, ArrayList<Integer> inOrder) {
		
		Map<Integer, Integer> inIdxMap = new HashMap<>();
		for(int i = 0; i < inOrder.size();  ++i){
			inIdxMap.put(inOrder.get(i), i);
		}
		
		return helper(0, 0, inOrder.size()-1, preOrder, inOrder, inIdxMap);
	}
	
	public TreeNode helper(int ps, int is, int ie, ArrayList<Integer> preOrder, ArrayList<Integer> inOrder, Map<Integer, Integer> inIdxMap){
		
		if(ps > preOrder.size()-1 || is > ie){
			return null;
		}
		
		TreeNode root = new TreeNode(preOrder.get(ps));
		int ri = inIdxMap.get(root.val);
		
		root.left = helper(ps+1, is, ri-1, preOrder, inOrder, inIdxMap);
		root.right = helper(ps+ri-is+1, ri+1, ie, preOrder, inOrder, inIdxMap);
		
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new BuildTreePreIn().buildTree(new ArrayList<>(Arrays.asList(1, 2, 3)), new ArrayList<>(Arrays.asList(2, 1, 3))));
	}

}
