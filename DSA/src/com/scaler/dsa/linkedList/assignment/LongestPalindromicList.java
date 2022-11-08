package com.scaler.dsa.linkedList.assignment;

import com.scaler.dsa.linkedList.assignment.LongestPalindromicList.ListNode;

public class LongestPalindromicList {
	
	class ListNode {
		public int val;
		public ListNode next;
		
		ListNode (int val){
			this.val = val;
			next = null;
		}
	}
	
	private int countCommon(ListNode l1, ListNode l2){
		
		int count = 0;
		
		for(; l1 != null && l2 != null; l1 = l1.next, l2 = l2.next){
			
			if(l1.val == l2.val){
				++count;
			} else {
				break;
			}
		}
		
		return count;
	}
	
	public int solve(ListNode head) {
		
		int result = 0;
		ListNode prev = null;
		ListNode curr = head;
		
		while(curr != null){
			ListNode next = curr.next;
			curr.next = prev;
			
			result = Math.max(result, 2 * countCommon(prev, next)+1);
			
			result = Math.max(result, 2 * countCommon(curr, next));
			
			prev = curr;
			curr = next;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestPalindromicList.ListNode node = new LongestPalindromicList().new ListNode(1);
		node.next = new LongestPalindromicList().new ListNode(2);
		node.next.next = new LongestPalindromicList().new ListNode(3);
		node.next.next.next = new LongestPalindromicList().new ListNode(2);
		node.next.next.next.next = new LongestPalindromicList().new ListNode(1);
		node.next.next.next.next.next = new LongestPalindromicList().new ListNode(70);
		node.next.next.next.next.next.next = new LongestPalindromicList().new ListNode(80);
		
		int  val = new LongestPalindromicList().solve(node);
		System.out.println(val);
		
		
		LongestPalindromicList.ListNode node2 = new LongestPalindromicList().new ListNode(10);
		node2.next = new LongestPalindromicList().new ListNode(20);
		node2.next.next = new LongestPalindromicList().new ListNode(30);
		node2.next.next.next = new LongestPalindromicList().new ListNode(20);
		node2.next.next.next.next = new LongestPalindromicList().new ListNode(50);
		
		val = new LongestPalindromicList().solve(node2);
		System.out.println(val);

	}

}
