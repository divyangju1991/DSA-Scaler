package com.scaler.dsa.tree.assignment;


public class ConvertArbitraryBinaryTree {
	
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
	
	
	private void convertTree(TreeNode node){
		
		int left_data = 0, right_data = 0, diff;
		
		if(node == null || (node.left == null && node.right == null)){
			return;
		} else {
			solve(node.left);
			solve(node.right);
			
			if(node.left != null)
				left_data = node.left.val;
			
			if(node.right != null)
				right_data = node.right.val;
			
			diff = left_data + right_data - node.val;
			
			if(diff > 0)
				node.val = node.val + diff;
			
			if(diff < 0)
				increment(node, -diff);
		}
	}
	
	private void increment(TreeNode node, int diff){
		
		if(node.left != null){
			node.left.val = node.left.val + diff;
			increment(node.left, diff);
		}
		
		else if(node.right != null){
			node.right.val = node.right.val + diff;
			increment(node.right, diff);
		}
	}
	
	public TreeNode solve(TreeNode node) {
		convertTree(node);
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
