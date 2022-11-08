package com.scaler.dsa.linkedList.homework;

import com.scaler.dsa.linkedList.homework.RemoveDuplicates.ListNode;

public class RemoveDuplicates {
	
	class ListNode {
		  public int val;
		  public ListNode next;
		  ListNode(int x) { val = x; next = null; }
	 }
	
	public ListNode deleteDuplicates(ListNode head) {
		ListNode prev = null;
		ListNode next = head;
		
		while(next != null){
			
			if(prev == null){
				prev = head;
			} else if(prev.val == next.val && next.next != null){
				prev.next = next.next;
			} else if(prev.val != next.val) {
				prev = next;				
			} else {
				prev.next = null;
			}
			next = next.next;
		}
		
		return head;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates.ListNode node = new RemoveDuplicates().new ListNode(1);
		node.next = new RemoveDuplicates().new ListNode(1);
		node.next.next = new RemoveDuplicates().new ListNode(2);
		
		RemoveDuplicates.ListNode ansNode = new RemoveDuplicates().deleteDuplicates(node); 
		System.out.println(ansNode);
		
		
		node = new RemoveDuplicates().new ListNode(1);
		node.next = new RemoveDuplicates().new ListNode(1);
		node.next.next = new RemoveDuplicates().new ListNode(2);
		node.next.next.next = new RemoveDuplicates().new ListNode(3);
		node.next.next.next.next = new RemoveDuplicates().new ListNode(3);
		ansNode = new RemoveDuplicates().deleteDuplicates(node); 
		System.out.println(ansNode);
		
	}

}
