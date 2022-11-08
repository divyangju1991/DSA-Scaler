package com.scaler.dsa.tree;

public class RecoverTree {
	
	TreeNode prev;
	TreeNode first;
	TreeNode middle;
	TreeNode last;
	
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
	
	private void inOrder(TreeNode root){
		
		inOrder(root.left);
		
		if(root != null && root.val < prev.val){
			
			if(first == null){
				first = prev;
				middle = root;
			} else {
				last = root;
			}
		}
		prev = root;
		inOrder(root.right);
	}
	
	public TreeNode recover(TreeNode root){
		first = middle = last = null;
		prev = new TreeNode(Integer.MIN_VALUE);
		
		inOrder(root);
		
		if(first != null && middle != null){
			swap(first, middle);
		}
		
		else if(first != null && last != null){
			swap(first, last);
		}
		
		return root;
		
	}
	
	private void swap(TreeNode t1, TreeNode t2){
		int t = t1.val;
		t1.val = t2.val;
		t2.val = t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
