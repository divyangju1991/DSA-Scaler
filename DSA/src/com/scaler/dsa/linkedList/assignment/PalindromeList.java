package com.scaler.dsa.linkedList.assignment;

import java.nio.file.FileSystemNotFoundException;

public class PalindromeList {
	
	class ListNode {
		
		public int val;
		public ListNode next;
		
		ListNode(int val){
			this.val = val;
			next = null;
		}
	}
	
	private ListNode getFirstHalfEnd(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		
		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return slow;
	}
	
	private ListNode reverseList(ListNode head){
		
		ListNode prev = null;
		ListNode curr = head;
		
		while(curr != null){
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next; 
		}
		
		return prev;
	}
	
	public int lPalin(ListNode head) {
		 if(head == null) return 1;
		 
		 ListNode firstHalfEnd = getFirstHalfEnd(head);
		 ListNode secondHalfStart = reverseList(firstHalfEnd.next);
		 
		 ListNode p1 = head;
		 ListNode p2 = secondHalfStart;
		 int result = 1;
		 
		 while(result == 1 && p2 != null){
			 
			 if(p1.val != p2.val) {
				 result = 0;
			 }
			 p1 = p1.next;
			 p2 = p2.next;
		 }
		 
		 firstHalfEnd.next = reverseList(secondHalfStart);
		 
		 return result;
	}

	public static void main(String[] args) {
		
		PalindromeList.ListNode node = new PalindromeList().new ListNode(1);
		node.next = new PalindromeList().new ListNode(2);
		node.next.next = new PalindromeList().new ListNode(3);
		node.next.next.next = new PalindromeList().new ListNode(2);
		node.next.next.next.next = new PalindromeList().new ListNode(1);
		
		int  val = new PalindromeList().lPalin(node);
		System.out.println(val);
		
		
		PalindromeList.ListNode node2 = new PalindromeList().new ListNode(10);
		node2.next = new PalindromeList().new ListNode(20);
		node2.next.next = new PalindromeList().new ListNode(30);
		node2.next.next.next = new PalindromeList().new ListNode(20);
		node2.next.next.next.next = new PalindromeList().new ListNode(50);
		
		val = new PalindromeList().lPalin(node2);
		System.out.println(val);
	}
}
