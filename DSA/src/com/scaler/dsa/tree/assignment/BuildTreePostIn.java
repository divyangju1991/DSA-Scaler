package com.scaler.dsa.tree.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BuildTreePostIn {
	
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
	
	public TreeNode buildTree(ArrayList<Integer> inOrder, ArrayList<Integer> postOrder) {
		
		if(inOrder == null || postOrder == null || inOrder.size() != postOrder.size()){
			return null;
		}
		
		Map<Integer, Integer> inOrderIdxMap = new HashMap<>();
		for(int i = 0; i < inOrder.size(); ++i){
			inOrderIdxMap.put(inOrder.get(i), i);
		}
		
		return buildTreePostIn(inOrder, 0, inOrder.size()-1, postOrder, 0, postOrder.size()-1, inOrderIdxMap);
		
	}
	
	private TreeNode buildTreePostIn(ArrayList<Integer> inOrder, int is, int ie, ArrayList<Integer> postOrder, int ps, int pe, Map<Integer, Integer> inOrderIdxMap){
		
		if(is > ie || ps > pe){
			return null;
		}
		
		TreeNode root = new TreeNode(postOrder.get(pe));
		int ri = inOrderIdxMap.get(postOrder.get(pe));
		
		root.left = buildTreePostIn(inOrder, is, ri-1, postOrder, ps, ps+ri-is-1, inOrderIdxMap);
		root.right = buildTreePostIn(inOrder, ri+1, ie, postOrder, ps+ri-is, pe-1, inOrderIdxMap);
		
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
