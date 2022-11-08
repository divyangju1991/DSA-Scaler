package com.scaler.dsa.tree.assignment;

public class FloorAndCeil {
	
	TreeNode root;
	int floor;
	int ceil;
	
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
	
	public int[][] solve(TreeNode root, int[] B) {
		
		int[][] res = new int[B.length][2];
		
		for(int i=0; i<B.length; ++i){
			floor = -1;
            ceil = -1;
			setFloorAndCeil(root, B[i]);
			
			res[i] = new int[]{floor, ceil};
		}
		
		return res;
	}
	
	private void setFloorAndCeil(TreeNode root, int key){
		
		while(root != null){
			
			if(root.val == key){
				floor = root.val;
				ceil = root.val;
				return;
			}
			
			if(key > root.val){
				floor = root.val;
				root = root.right;
			} else {
				ceil = root.val;
				root = root.left;
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
