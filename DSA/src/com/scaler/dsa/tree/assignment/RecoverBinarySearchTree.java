package com.scaler.dsa.tree.assignment;


public class RecoverBinarySearchTree {
	
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
	
	TreeNode firstElement = null;
	TreeNode secondElement = null;
	TreeNode prevElement = new TreeNode(Integer.MIN_VALUE);
	
	private void traverse(TreeNode root){
		
		if(root == null){
			return;
		}
		
		traverse(root.left);
		
		if(firstElement == null && prevElement.val >= root.val){
			firstElement = prevElement;
		}
		
		if(firstElement != null && prevElement.val >= root.val){
			secondElement = root;
		}
		
		prevElement = root;
		
		traverse(root.right);
		
	}
	
	public int[] recoverTree(TreeNode root) {
		
		traverse(root);
		
		int tmp = firstElement.val;
		firstElement.val = secondElement.val;
		secondElement.val = tmp;
		
		return new int[]{firstElement.val, secondElement.val};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
