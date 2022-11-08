package com.scaler.dsa.tree.homework;

import java.util.ArrayList;

public class ZigZagLevel {
	
	ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	
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
	
	public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
		
		if(root == null)
			return res;
		
		dfs(root, 0);
		
		return res;
	}
	
	private void dfs(TreeNode root, int level){
		
		if(level >= res.size()){
			ArrayList subList = new ArrayList<>();
			subList.add(root.val);
			res.add(subList);
		} else {
			
			if(level %2 == 0){
				res.get(level).add(root.val);
			} else {
				res.get(level).add(0, root.val);
			}
		}
		
		if(root.left != null) dfs(root.left, level+1);
		if(root.right != null) dfs(root.right, level+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
