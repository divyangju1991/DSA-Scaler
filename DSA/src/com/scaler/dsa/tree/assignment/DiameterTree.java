package com.scaler.dsa.tree.assignment;

public class DiameterTree {
	
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val){
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}
	
	int max = 0;
	
	public int solve(TreeNode root) {
		maxDepth(root);
		return max;
	}
	
	private int maxDepth(TreeNode root) {
		
		if(root == null){
			return 0;
		}
		
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		
		max = Integer.max(max, left+right);
		
		return Math.max(left, right)+1;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
