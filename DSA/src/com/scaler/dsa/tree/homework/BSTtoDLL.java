package com.scaler.dsa.tree.homework;


public class BSTtoDLL {
	
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
	
	TreeNode solve (TreeNode root) {
		
		if(root == null){
			return root;
		}
		
		if(root.left != null){
			
			TreeNode left = solve(root.left);
			
			while(left.right != null){
				left = left.right;
			}
			
			left.right = root;
			root.left = left;
		}
		
		if(root.right != null){
			
			TreeNode right = solve(root.right);
			
			while(right.left != null){
				right = right.left;
			}
			
			right.left = root;
			root.right = right;
		}
		
		while(root.left != null){
			root = root.left;
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
