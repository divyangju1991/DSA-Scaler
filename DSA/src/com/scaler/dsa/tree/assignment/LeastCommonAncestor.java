package com.scaler.dsa.tree.assignment;

public class LeastCommonAncestor {
	
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val)
		{
			this.val = val;
			left = null;
			right = null;
		}
	}
	
	public int lca(TreeNode root, int p, int q) {
		
		TreeNode node = lcaHelper(root, p, q);
		
		return node.val;
    }
	
	private TreeNode lcaHelper(TreeNode root, int p, int q) {
		
		if(root == null || root.val == p || root.val == q){
			return root;
		}
		
		TreeNode left = lcaHelper(root.left, p, q);
		TreeNode right = lcaHelper(root.right, p,q);
		
		if(left == null){
			return right;
		} else if(right == null){
			return left;
		} else {
			return root;
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
