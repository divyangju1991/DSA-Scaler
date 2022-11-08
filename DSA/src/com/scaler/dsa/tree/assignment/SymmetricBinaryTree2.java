package com.scaler.dsa.tree.assignment;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricBinaryTree2 {
	
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
	
	public int isSymmetric(TreeNode root) {
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		q.add(root);
		
		while(!q.isEmpty()){
			TreeNode t1 = q.poll();
			TreeNode t2 = q.poll();
			
			if(t1 == null && t2 == null) continue;
			if(t1 == null || t2 == null) return 0;
			
			if(t1.val != t2.val) return 0;
			
			q.add(t1.left);
			q.add(t2.right);
			q.add(t1.right);
			q.add(t2.left);
		}
		
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
