package com.scaler.dsa.tree;


public class BalancedBinaryTree2 {
	
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val){
			this.val = val;
			left = null;
			right = null;
		}
	}
	
	public boolean isBalancedTree(TreeNode root){
		
		return (getHeight(root) != -1); 		
	}
	
	private int getHeight(TreeNode root){
		
		if(root == null){
			return 0;
		}
		
		int left = getHeight(root.left);
		if(left == -1) return -1;
		int right = getHeight(root.right);
		if(right == -1) return -1;
		
		if(Math.abs(left - right) > 1) return -1;
		
		return Math.max(left, right) +1;
	}

	public static void main(String[] args) {
		BalancedBinaryTree2.TreeNode node = new BalancedBinaryTree2().new TreeNode(1);
		node.left =  new BalancedBinaryTree2().new TreeNode(2);//2
		node.right =  new BalancedBinaryTree2().new TreeNode(3);
		node.left.left = new BalancedBinaryTree2().new TreeNode(4);//3
		node.left.right = new BalancedBinaryTree2().new TreeNode(5);
		node.left.left.left = new BalancedBinaryTree2().new TreeNode(6);//4
		node.left.left.right = new BalancedBinaryTree2().new TreeNode(7);
		
		System.out.println(new BalancedBinaryTree2().isBalancedTree(node));
		
		node = new BalancedBinaryTree2().new TreeNode(1);
		System.out.println(new BalancedBinaryTree2().isBalancedTree(node));
		
		node = new BalancedBinaryTree2().new TreeNode(1);
		node.left =  new BalancedBinaryTree2().new TreeNode(2);//2
		node.right =  new BalancedBinaryTree2().new TreeNode(3);
		System.out.println(new BalancedBinaryTree2().isBalancedTree(node));
		
		
		node = new BalancedBinaryTree2().new TreeNode(1);
		node.left =  new BalancedBinaryTree2().new TreeNode(2);//2
		node.right =  new BalancedBinaryTree2().new TreeNode(3);
		node.left.left = new BalancedBinaryTree2().new TreeNode(4);//3
		node.left.right = new BalancedBinaryTree2().new TreeNode(5);
		node.right.left = new BalancedBinaryTree2().new TreeNode(6);//3
		node.right.right = new BalancedBinaryTree2().new TreeNode(7);
		
		System.out.println(new BalancedBinaryTree2().isBalancedTree(node));

	}

}
