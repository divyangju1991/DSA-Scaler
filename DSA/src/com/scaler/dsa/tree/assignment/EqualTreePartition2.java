package com.scaler.dsa.tree.assignment;

import java.util.HashMap;
import java.util.Map;


public class EqualTreePartition2 {
	
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
	
	Map<Long, Boolean> seen;
	private boolean isEqualTreePartition(TreeNode root){
		seen = new HashMap<>();
		long total = sum(root);
		
		if(total % 2 == 0)
			return seen.get(total/2) != null;
		return false;
	}
	
	private long sum(TreeNode root){
		if(root == null)
			return 0;
		
		long sum = sum(root.left)+sum(root.right)+(long)root.val;
		seen.put(sum, true);
		return sum;
	}
	
	public int solve(TreeNode root) {
		return isEqualTreePartition(root) ? 1 : 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualTreePartition2.TreeNode node = new EqualTreePartition2().new TreeNode(1);
		node.left =  new EqualTreePartition2().new TreeNode(2);//2
		node.right =  new EqualTreePartition2().new TreeNode(3);
		node.left.left = new EqualTreePartition2().new TreeNode(4);//3
		node.left.right = new EqualTreePartition2().new TreeNode(5);
		node.left.left.left = new EqualTreePartition2().new TreeNode(6);//4
		node.left.left.right = new EqualTreePartition2().new TreeNode(7);
		
		System.out.println(new EqualTreePartition2().solve(node));
		
		node = new EqualTreePartition2().new TreeNode(1);
		System.out.println(new EqualTreePartition2().solve(node));
		
		node = new EqualTreePartition2().new TreeNode(1);
		node.left =  new EqualTreePartition2().new TreeNode(2);//2
		node.right =  new EqualTreePartition2().new TreeNode(3);
		System.out.println(new EqualTreePartition2().solve(node));

	}

}
