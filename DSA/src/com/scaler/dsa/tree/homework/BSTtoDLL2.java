package com.scaler.dsa.tree.homework;


public class BSTtoDLL2 {
	
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
	
	TreeNode head;
	TreeNode prev;
	
	private void findHead(TreeNode root){
		
		if(root == null){
			return;
		}
		
		findHead(root.left);
		
		if(prev == null){
			head = root;
		} else {
			root.left = prev;
			prev.right = root;
		}
		
		prev = root;
		
		findHead(root.right);
	}
	
	TreeNode solve (TreeNode root) {
		head = null;
		prev = null;
		findHead(root);
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
