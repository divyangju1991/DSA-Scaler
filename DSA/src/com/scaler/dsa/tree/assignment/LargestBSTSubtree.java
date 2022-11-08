package com.scaler.dsa.tree.assignment;

import com.scaler.dsa.tree.assignment.RecoverBinarySearchTree.TreeNode;

public class LargestBSTSubtree {
	
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
	
	class NodeValue {
		
		public int minNode, maxNode, maxSize;
		
		NodeValue(int minNode, int maxNode, int maxSize){
			this.maxNode = maxNode;
			this.minNode = minNode;
			this.maxSize = maxSize;
		}
	}
	
	public NodeValue largestBSTSubTreeHelper(TreeNode root){

		if(root == null){
			return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
		}
		
		NodeValue left = largestBSTSubTreeHelper(root.left);
		NodeValue right = largestBSTSubTreeHelper(root.right);
		
		if(left.maxNode < root.val && root.val < right.minNode){
			return new NodeValue(Math.min(root.val, left.minNode), Math.max(root.val, right.maxNode), left.maxSize+ right.maxSize + 1);
		}
		
		return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.maxSize, right.maxSize));
	}
	
	public int solve(TreeNode root) {
		return largestBSTSubTreeHelper(root).maxSize;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
