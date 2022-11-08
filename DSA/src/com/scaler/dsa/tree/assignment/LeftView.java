package com.scaler.dsa.tree.assignment;

import java.util.ArrayList;

public class LeftView {
	
	ArrayList<Integer> leftSide = new ArrayList<>();
	
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
	
	public ArrayList<Integer> solve(TreeNode root) {
		
		if(root == null) return leftSide;
		
		leftView(root, 0);
		
		return leftSide;
	}
	
	private void leftView(TreeNode root, int level){
		
		if(level == leftSide.size())
			leftSide.add(root.val);
		
		if(root.left != null)
			leftView(root.left, level+1);
		
		if(root.right != null)
			leftView(root.right, level+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
