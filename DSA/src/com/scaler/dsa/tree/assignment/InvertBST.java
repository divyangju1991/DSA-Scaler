package com.scaler.dsa.tree.assignment;

import com.scaler.dsa.tree.assignment.InvertBST.TreeNode;

public class InvertBST {
	
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
		
		public TreeNode invertTree(TreeNode root) {
			 
			if(root == null){
				return null;
			}
			
			TreeNode right = invertTree(root.right);
			TreeNode left = invertTree(root.left);
			root.right = left;
			root.left = right;
			
			return root;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InvertBST.TreeNode node = new InvertBST().new TreeNode(1);
		node.left =  new InvertBST().new TreeNode(2);//2
		node.right =  new InvertBST().new TreeNode(3);
		node.left.left = new InvertBST().new TreeNode(4);//3
		node.left.right = new InvertBST().new TreeNode(5);
		node.left.left.left = new InvertBST().new TreeNode(6);//4
		node.left.left.right = new InvertBST().new TreeNode(7);
		
		System.out.println(new InvertBST().invertTree(node));
		
		node = new InvertBST().new TreeNode(1);
		System.out.println(new InvertBST().invertTree(node));
		
		node = new InvertBST().new TreeNode(1);
		node.left =  new InvertBST().new TreeNode(2);//2
		node.right =  new InvertBST().new TreeNode(3);
		System.out.println(new InvertBST().invertTree(node));

	}

}
