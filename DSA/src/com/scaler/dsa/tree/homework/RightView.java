package com.scaler.dsa.tree.homework;

import java.util.ArrayList;

public class RightView {
	
	ArrayList<Integer> rightSide = new ArrayList<>();
	
	class TreeNode{
		
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val){
			this.val = val;
			left = null;
			right = null;
		}
		
		public ArrayList<Integer> solve(TreeNode root) {
			
			if(root == null){
				return rightSide;
			}
			
			rightView(root, 0);
			
			return rightSide;
		}
		
		private void rightView(TreeNode root, int level){
			
			if(level == rightSide.size())
				rightSide.add(root.val);
			
			if(root.right != null)
				rightView(root.right, level+1);
			
			if(root.left != null)
				rightView(root.left, level+1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
