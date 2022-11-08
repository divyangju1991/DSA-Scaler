package com.scaler.dsa.tree;

public class BalancedBinaryTree {
	
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
	
	public boolean isBalancedTree(TreeNode root){
		
		if(root == null){
			return true;
		}
		
		int leftHeight = getHLeft(root.left);
		int rightHeight = getHRight(root.right);
		
		if(Math.abs(rightHeight - leftHeight) > 1)
			return false;
		
		boolean isLeftBalanced = isBalancedTree(root.left);
		boolean isRightBalanced = isBalancedTree(root.right);
				
		if(!isLeftBalanced || !isRightBalanced){
			return false;
		}
		
		return true;
		
	}
	
	private int getHLeft(TreeNode root){
		
		if(root == null){
			return 0;
		}
		
		return getHLeft(root.left) + 1;
	}
	
	private int getHRight(TreeNode root){
		
		if(root == null){
			return 0;
		}
		
		return getHRight(root.right) + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
