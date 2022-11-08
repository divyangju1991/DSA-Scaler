package com.scaler.dsa.tree.assignment;

/**
 * Since I have the tree in every recursive step, I have O(log(n)) steps. Finding a height costs O(log(n)). So overall O(log(n)^2).
 * @author Divyang
 *
 */
public class CountCompleteTreeNodes {
	
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
	
	int height(TreeNode root){
		return root == null ? -1 : 1 + height(root.left);
	}
	
	public int countNodes(TreeNode root){
		
		int h = height(root);
		
		return h < 0 ? 0 : height(root.right) == h -1 ? (1 << h) + countNodes(root.right)
		                                              : (1 << h-1) + countNodes(root.left);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountCompleteTreeNodes.TreeNode node = new CountCompleteTreeNodes().new TreeNode(1);
		node.left = new CountCompleteTreeNodes().new TreeNode(2);
		node.right = new CountCompleteTreeNodes().new TreeNode(3);
		node.left.left = new CountCompleteTreeNodes().new TreeNode(4);
		
		System.out.println(new CountCompleteTreeNodes().countNodes(node));
		
	}

}
