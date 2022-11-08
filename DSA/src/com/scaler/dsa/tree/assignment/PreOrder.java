package com.scaler.dsa.tree.assignment;

import java.util.ArrayList;


public class PreOrder {
	
	class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) {
	     val = x;
	     left=null;
	     right=null;
	    }
	}
	
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		
		ArrayList<Integer> result = new ArrayList<>();
		
		if(root != null){
			result.add(root.val);
			result.addAll(preorderTraversal(root.left));
			result.addAll(preorderTraversal(root.right));
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
