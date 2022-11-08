package com.scaler.dsa.tree.assignment;

public class SortedArray {
	
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
	
	 public TreeNode sortedArrayToBST(final int[] num) {
		 
		 if(num.length == 0){
			 return null;
		 }
		 
		 TreeNode head = helper(num, 0, num.length-1);
		 return head;
		 
	 }
	 
	 private TreeNode helper(int[] num, int low, int high){
		 
		if(low > high){
			return null;
		}
		
		int mid = (low + high)/2;
		TreeNode root = new TreeNode(num[mid]);
		root.left = helper(num, low, mid-1);
		root.right = helper(num, mid+1, high);
		
		return root;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
