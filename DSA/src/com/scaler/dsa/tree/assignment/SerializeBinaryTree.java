package com.scaler.dsa.tree.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeBinaryTree {
	
	class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) {
		      val = x;
		      left=null;
		      right=null;
		     }
		 }
	
	public ArrayList<Integer> solve(TreeNode root) {
        ArrayList<Integer> wrapList = new ArrayList<>();
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        if(root == null) wrapList.add(-1);
        
        queue.offer(root);
        while(!queue.isEmpty()){

            TreeNode tmp = queue.poll();
            if(tmp == null)
                wrapList.add(-1);
            else
                wrapList.add(tmp.val);    
            
            if(tmp != null) {
                queue.offer(tmp.left);                
                queue.offer(tmp.right); 
            }                        
            
        }
        return wrapList;  
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
