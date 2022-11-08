package com.scaler.dsa.tree;


public class KthSortstNode {
	
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
		
		int count = 0;
		TreeNode ans = null;
		
		public TreeNode getKthSortstNode(TreeNode root, int k){		
			
			inOrder(root, k);
			
			return ans;
		}
		
		private void inOrder(TreeNode root, int k){
			
			if(root == null){
				return;
			}
			
			inOrder(root.left, k);
			++count;
			if(count == k){
				ans = root;
				return;
			}
			inOrder(root.right, k);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KthSortstNode.TreeNode node = new KthSortstNode().new TreeNode(5);
		node.left =  new KthSortstNode().new TreeNode(4);//2
		node.right =  new KthSortstNode().new TreeNode(7);
		node.left.left = new KthSortstNode().new TreeNode(3);//3
		node.left.left.left = new KthSortstNode().new TreeNode(1);//4
		node.left.left.right = new KthSortstNode().new TreeNode(2);
		node.right.left =  new KthSortstNode().new TreeNode(6);
		node.right.right =  new KthSortstNode().new TreeNode(8);
		
		KthSortstNode.TreeNode ans = new KthSortstNode().getKthSortstNode(node, 3);
		
		System.out.println(ans.val);
		
		node = new KthSortstNode().new TreeNode(1);
		ans = new KthSortstNode().getKthSortstNode(node,1);
		System.out.println(ans.val);
		
		node = new KthSortstNode().new TreeNode(2);
		node.left =  new KthSortstNode().new TreeNode(1);//2
		node.right =  new KthSortstNode().new TreeNode(3);
		ans = new KthSortstNode().getKthSortstNode(node, 2);
		System.out.println(ans.val);

	}

}
