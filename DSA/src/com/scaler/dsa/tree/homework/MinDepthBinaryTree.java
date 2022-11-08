package com.scaler.dsa.tree.homework;

public class MinDepthBinaryTree {
	
	class TreeNode{
		
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val){
			this.val = val;
			left = null;
			right = null;
		}
	}
	
	public int minDepth(TreeNode root) {
		
		if(root == null){
			return 0;
		}
		
		if((root.left == null) && (root.right == null)){
			return 1;
		}
		
		int minDepth = Integer.MAX_VALUE;
		if(root.left != null){
			minDepth = Math.min(minDepth, minDepth(root.left));
		}
		
		if(root.right != null){
			minDepth = Math.min(minDepth, minDepth(root.right));
		}
		
		return minDepth+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
