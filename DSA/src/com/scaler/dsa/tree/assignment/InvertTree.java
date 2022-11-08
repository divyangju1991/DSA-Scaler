package com.scaler.dsa.tree.assignment;

public class InvertTree {
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	}
	
	public TreeNode invertTree(TreeNode root) {
		if(root == null){
			return root;
		}
		
		TreeNode right = invertTree(root.right);
		TreeNode left = invertTree(root.left);
		
		root.right = left;
		root.left = right;
		
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
