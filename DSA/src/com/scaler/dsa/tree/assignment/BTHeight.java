package com.scaler.dsa.tree.assignment;

public class BTHeight {

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
	
	public int getBTHeight(TreeNode root){
		
		if(root == null){
			return 0;
		}
		
		int left = getBTHeight(root.left);
		int right = getBTHeight(root.right);
		
		return Math.max(left, right)+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTHeight.TreeNode node = new BTHeight().new TreeNode(1);
		node.left =  new BTHeight().new TreeNode(2);//2
		node.right =  new BTHeight().new TreeNode(3);
		node.left.left = new BTHeight().new TreeNode(4);//3
		node.left.right = new BTHeight().new TreeNode(5);
		node.left.left.left = new BTHeight().new TreeNode(6);//4
		node.left.left.right = new BTHeight().new TreeNode(7);
		
		System.out.println(new BTHeight().getBTHeight(node));
		
		node = new BTHeight().new TreeNode(1);
		System.out.println(new BTHeight().getBTHeight(node));
		
		node = new BTHeight().new TreeNode(1);
		node.left =  new BTHeight().new TreeNode(2);//2
		node.right =  new BTHeight().new TreeNode(3);
		System.out.println(new BTHeight().getBTHeight(node));
	}

}
