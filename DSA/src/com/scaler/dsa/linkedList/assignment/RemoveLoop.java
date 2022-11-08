package com.scaler.dsa.linkedList.assignment;

import java.util.*;

import com.scaler.dsa.linkedList.assignment.KReverseLinkedList.ListNode;

public class RemoveLoop {
	
	class ListNode {
		 public int val;
		 public ListNode next;
		 ListNode(int x) { val = x; next = null; }
	}
	
	public ListNode solve(ListNode head) {

        HashSet<ListNode> s = new HashSet<ListNode>();
        ListNode prev = null;
        ListNode curr = head;
        while (head != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle and we
            // need to remove this cycle so set the next of
            // the previous pointer with null.
  
            if (s.contains(curr)) {
                prev.next = null;
                return head;
            }
  
            // If we are seeing the node for
            // the first time, insert it in hash
            else {
                s.add(curr);
                prev = curr;
                curr = curr.next;
            }
        }
  
        return null;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveLoop.ListNode cycleNode = new RemoveLoop().new ListNode(2);
		
		RemoveLoop.ListNode node = new RemoveLoop().new ListNode(1);
		node.next = cycleNode;
		node.next.next = new RemoveLoop().new ListNode(3);
		node.next.next.next = new RemoveLoop().new ListNode(4);
		node.next.next.next.next = cycleNode;
		
		RemoveLoop.ListNode ansNode = new RemoveLoop().solve(node);
		System.out.println(ansNode);
		
		cycleNode = new RemoveLoop().new ListNode(90);
		RemoveLoop.ListNode node2 = cycleNode;
		node2.next = new RemoveLoop().new ListNode(10);
		node2.next.next = new RemoveLoop().new ListNode(20);
		node2.next.next.next = new RemoveLoop().new ListNode(40);
		node2.next.next.next.next = cycleNode;
		
		ansNode = new RemoveLoop().solve(node2);
		System.out.println(ansNode);
	}

}
