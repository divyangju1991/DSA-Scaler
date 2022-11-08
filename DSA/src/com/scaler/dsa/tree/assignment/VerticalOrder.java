package com.scaler.dsa.tree.assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class VerticalOrder {
	
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
	
	public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode root) {
		
       TreeMap<Integer,ArrayList<Integer>> map =  new TreeMap<Integer,ArrayList<Integer>>();
       preorder(root,0,map);
       ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
       
       for(Map.Entry<Integer,ArrayList<Integer>> m :  map.entrySet()){
           res.add(m.getValue());
       }
      
       return res;
   }
   class Pair{
       int hd;
       TreeNode tem;
       Pair(int hd,TreeNode tem){
           this.hd =  hd;
           this.tem = tem;
       }
   }
   
   public void preorder(TreeNode root,int op,TreeMap<Integer,ArrayList<Integer>> map){
   
	   if(root == null){
           return;
       }
   
  
	   Queue<Pair> q = new LinkedList<Pair>();
	   q.add(new Pair(op,root));
	   while(!q.isEmpty()){
		   Pair temp =  q.poll();
      
		   ArrayList<Integer> res =  map.getOrDefault(temp.hd, new ArrayList<Integer>());          
           res.add(temp.tem.val);
           map.put(temp.hd,res);
          
           if(temp.tem.left !=null){
        	   q.add(new Pair(temp.hd-1,temp.tem.left));
           }
           if(temp.tem.right != null){
        	   q.add(new Pair(temp.hd+1,temp.tem.right));
           }
	   }
    
   }
}