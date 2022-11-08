package com.scaler.dsa.tree.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
	
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
	
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
				
		while(!q.isEmpty()){
			
			int numOfsize = q.size();
			ArrayList<Integer> subList = new ArrayList<>();
			
			for(int i=0; i<numOfsize; i++){
				TreeNode tmp = q.poll();
				
				if(tmp.left != null)
					q.add(tmp.left);
				
				if(tmp.right != null)
					q.add(tmp.right);
				
				subList.add(tmp.val);
			}			
			
			res.add(subList);
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
