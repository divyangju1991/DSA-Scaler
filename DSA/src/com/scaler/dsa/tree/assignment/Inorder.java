package com.scaler.dsa.tree.assignment;

import java.util.ArrayList;

public class Inorder {
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val){
			this.val = val;
			left = null;
			right = null;
		}
		
		public ArrayList<Integer> inorderTraversal(TreeNode root) {
			
			ArrayList<Integer> result = new ArrayList<>();
			
			if(root != null){
				result.addAll(inorderTraversal(root.left));
				result.add(root.val);
				result.addAll(inorderTraversal(root.right));
			}
			
			return result;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
