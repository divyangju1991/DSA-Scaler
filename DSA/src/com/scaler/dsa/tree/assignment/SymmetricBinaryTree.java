package com.scaler.dsa.tree.assignment;

public class SymmetricBinaryTree {
	
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
	
	public int isSymmetric(TreeNode root) {
		return isMirror(root, root) ? 1 : 0;
	}
	
	private boolean isMirror(TreeNode t1, TreeNode t2){
		
		if(t1 == null && t2 == null) return true;
		if(t1 == null || t2 == null) return false;
		
		return (t1.val == t2.val) && isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
