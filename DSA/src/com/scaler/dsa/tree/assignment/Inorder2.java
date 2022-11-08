package com.scaler.dsa.tree.assignment;

import java.util.ArrayList;
import java.util.Stack;

public class Inorder2 {
	
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
			
			if(root == null) return result;
			
			Stack<TreeNode> stack = new Stack<>();
			TreeNode curr = root;
			
			while(curr != null && !stack.isEmpty()){
				
				while(curr != null){
					stack.add(curr);
					curr = curr.left;
				}
				
				curr = stack.pop();
				result.add(curr.val);
				curr = curr.right;
			}
			
			return result;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
