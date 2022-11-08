package com.scaler.dsa.tree.assignment;

import java.util.Stack;


public class EqualTreePartition {
	
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
	
	Stack<Long> seen;
	private boolean isEqualTreePartition(TreeNode root){
		seen = new Stack();
		long total = sum(root);
		seen.pop();
		if(total % 2 == 0)
			for(long s : seen)
				if(s == total/2)
					return true;
		return false;
	}
	
	private long sum(TreeNode root){
		if(root == null)
			return 0;
		
		seen.push(sum(root.left)+sum(root.right)+(long)root.val);
		return seen.peek();
	}
	
	public int solve(TreeNode root) {
		return isEqualTreePartition(root) ? 1 : 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualTreePartition.TreeNode node = new EqualTreePartition().new TreeNode(1);
		node.left =  new EqualTreePartition().new TreeNode(2);//2
		node.right =  new EqualTreePartition().new TreeNode(3);
		node.left.left = new EqualTreePartition().new TreeNode(4);//3
		node.left.right = new EqualTreePartition().new TreeNode(5);
		node.left.left.left = new EqualTreePartition().new TreeNode(6);//4
		node.left.left.right = new EqualTreePartition().new TreeNode(7);
		
		System.out.println(new EqualTreePartition().solve(node));
		
		node = new EqualTreePartition().new TreeNode(1);
		System.out.println(new EqualTreePartition().solve(node));
		
		node = new EqualTreePartition().new TreeNode(1);
		node.left =  new EqualTreePartition().new TreeNode(2);//2
		node.right =  new EqualTreePartition().new TreeNode(3);
		System.out.println(new EqualTreePartition().solve(node));

	}

}
