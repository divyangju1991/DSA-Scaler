package com.scaler.dsa.tree.assignment;

public class LeastCommonAncestor2 {
	
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

	       if(isNodeExits(root, p) && isNodeExits(root, q)){
	    	   TreeNode node = lcaHelper(root, p, q);
	    	   return node.val;
	       } else {
	    	   return -1;
	       }
	}
		
	private TreeNode lcaHelper(TreeNode root, int p, int q) {
		
		if(root == null || root.val == p || root.val == q) return root;
		TreeNode left = lcaHelper(root.left, p, q);
		TreeNode right = lcaHelper(root.right, p, q);
		return left == null ? right : right == null ? left : root;
	}
	
	private boolean isNodeExits(TreeNode root, int key){
		
		if(root == null){
			return false;
		}
		
		if(root.val == key){
			return true;
		}
		
		boolean res = isNodeExits(root.left, key);
		
		if(res) return true;
		
		res = isNodeExits(root.right, key);
		
		return res;
	}

	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeastCommonAncestor2.TreeNode root = new LeastCommonAncestor2().new TreeNode(2);
	}

}
