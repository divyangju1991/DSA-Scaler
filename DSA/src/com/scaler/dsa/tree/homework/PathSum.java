package com.scaler.dsa.tree.homework;

public class PathSum {
	
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
	
	private boolean containsPathSum(TreeNode root, int sum){
		
		if(root == null){
			return false;
		}
		
		sum -= root.val;
		
		if(root.left == null && root.right == null){
			return sum == 0;
		}
		
		return (containsPathSum(root.left, sum) ||
				containsPathSum(root.right, sum));
	}
	
	public int hasPathSum(TreeNode root, int sum) {
		
		return containsPathSum(root, sum) ? 1 : 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
