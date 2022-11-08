package com.scaler.dsa.tree.assignment;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrder2 {
	
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
			
			if(root == null) return result;
			
			Stack<TreeNode> stack = new Stack<>();
			stack.add(root);
			
			while(!stack.isEmpty()){
				TreeNode node = stack.pop();
				result.add(0, node.val);
				
				if(node.left != null) stack.add(node.left);
				if(node.right != null) stack.add(node.right);
			}
			
			return result;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
