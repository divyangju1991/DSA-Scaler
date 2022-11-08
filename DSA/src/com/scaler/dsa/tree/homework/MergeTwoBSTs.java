package com.scaler.dsa.tree.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MergeTwoBSTs {
	
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
	
	
	public int[] solve(TreeNode t1, TreeNode t2) {

        TreeNode root = mergeBST(t1, t2);
        List<Integer> list = new ArrayList();
        inOrder(root, list);
 
        int[] ans = list.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();

        return ans;
    }

    private void inOrder(TreeNode root, List<Integer> list){

        if(root == null){
            return;
        }

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    private TreeNode mergeBST(TreeNode t1, TreeNode t2){

         if (t1 == null)
            return t2;
        Stack < TreeNode[] > stack = new Stack < > ();
        stack.push(new TreeNode[] {t1, t2});
        while (!stack.isEmpty()) {
            TreeNode[] t = stack.pop();
            if (t[0] == null || t[1] == null) {
                continue;
            }
            t[0].val += t[1].val;
            if (t[0].left == null) {
                t[0].left = t[1].left;
            } else {
                stack.push(new TreeNode[] {t[0].left, t[1].left});
            }
            if (t[0].right == null) {
                t[0].right = t[1].right;
            } else {
                stack.push(new TreeNode[] {t[0].right, t[1].right});
            }
        }
        return t1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
