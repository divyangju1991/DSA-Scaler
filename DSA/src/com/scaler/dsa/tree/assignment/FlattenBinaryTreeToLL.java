package com.scaler.dsa.tree.assignment;

public class FlattenBinaryTreeToLL {
	
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
	
	public TreeNode flatten(TreeNode root) {

        TreeNode head = root;
		flattenTree(root);
		return head;
	}

    private TreeNode flattenTree(TreeNode root) {

        if(root == null || (root.left == null && root.right == null)){
			return root;
		}
		
		TreeNode leftTail = flattenTree(root.left);
		TreeNode rightTail = flattenTree(root.right);
		
		if(leftTail != null){
			leftTail.right = root.right;
			root.right = root.left;
			root.left = null;
		}
		
		return rightTail == null ? leftTail : rightTail;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
