package com.scaler.dsa.tree.assignment;

import java.util.ArrayList;

public class PostOrder {
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val){
			this.val = val;
			left = null;
			right = null;
		}
		
		public ArrayList<Integer> postorderTraversal(TreeNode root) {
			
			ArrayList<Integer> result = new ArrayList<>();
			
			if(root != null){
				result.addAll(postorderTraversal(root.left));
				result.addAll(postorderTraversal(root.right));
				result.add(root.val);
			}
			
			return result;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
