package com.scaler.dsa.tree.assignment;

import java.util.ArrayList;
import java.util.Stack;


public class PreOrder2 {
	
	class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) {
	     val = x;
	     left=null;
	     right=null;
	    }
	}
	
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		
		ArrayList<Integer> result = new ArrayList<>();
		
		if(root == null) return result;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		
		while(!stack.isEmpty()){
			TreeNode node = stack.pop();
			result.add(node.val);
			
			if(root.right != null) stack.add(node.right);
			if(root.left != null) stack.add(node.left);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
