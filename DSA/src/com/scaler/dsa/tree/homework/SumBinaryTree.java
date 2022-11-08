package com.scaler.dsa.tree.homework;

public class SumBinaryTree {
	
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
	
	private int sumTree(TreeNode root){
		
		if(root == null){
			return 0;
		}
		
		if(root.left == null && root.right == null){
			return root.val;
		}
		
		int ls = sumTree(root.left); 	
		int rs = sumTree(root.right);	
		
		if(ls != Integer.MIN_VALUE && rs != Integer.MIN_VALUE && root.val == ls + rs){
			return 2 * root.val;
		}
		
		return Integer.MIN_VALUE;
		
	}
	
	public int solve(TreeNode root) {
		
		return sumTree(root) > 0 ? 1 : 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
