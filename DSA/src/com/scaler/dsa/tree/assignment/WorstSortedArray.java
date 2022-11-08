package com.scaler.dsa.tree.assignment;

public class WorstSortedArray {
	
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
	
	 public TreeNode sortedArrayToBST(final int[] A) {
		 
		 int n = A.length;
		 
		 TreeNode root = new TreeNode(A[n/2]);
		 TreeNode node = root;
		 
		 for(int i=0; i < n; ++i){
			 
			 if(i != n/2)
				 insert(root, A[i]);
		 }
		 
		 return node;
	 }
	 
	 private TreeNode insert(TreeNode root, int key){
		 
		 if(root == null){
			 TreeNode node = new TreeNode(key);
			 return node;
		 }
		 
		 if(root.val < key){
			 root.right = insert(root.right, key);
		 } else if(root.val > key){
			 root.left = insert(root.left, key);
		 } else {
			 return root;
		 }
		 
		 return root;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
