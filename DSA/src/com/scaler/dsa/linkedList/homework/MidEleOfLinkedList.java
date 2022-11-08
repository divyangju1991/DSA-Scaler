package com.scaler.dsa.linkedList.homework;

public class MidEleOfLinkedList {
	
	 class ListNode {
		  public int val;
		  public ListNode next;
		  ListNode(int x) { val = x; next = null; }
	 }
	
	 public int solve(ListNode head) {

		 ListNode slow = head;
	     ListNode fast = (head.next == null) ? null : head.next.next;
	     
	     int i = 2;
	     while(fast != null){
	    	 slow = slow.next;
	    	 i = (fast.next == null) ? i+1 : i+2;
	    	 fast = (fast.next == null) ? null : fast.next.next;
	     }

	     return (i > 2 && i%2 == 0) ? slow.next.val : slow.val;
	     
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MidEleOfLinkedList.ListNode node = new MidEleOfLinkedList().new ListNode(1);
		node.next = new MidEleOfLinkedList().new ListNode(2);
		node.next.next = new MidEleOfLinkedList().new ListNode(3);
		node.next.next.next = new MidEleOfLinkedList().new ListNode(4);
		node.next.next.next.next = new MidEleOfLinkedList().new ListNode(5);
		System.out.println(new MidEleOfLinkedList().solve(node));
		
		
		node = new MidEleOfLinkedList().new ListNode(1);
		node.next = new MidEleOfLinkedList().new ListNode(5);
		node.next.next = new MidEleOfLinkedList().new ListNode(6);
		node.next.next.next = new MidEleOfLinkedList().new ListNode(2);
		node.next.next.next.next = new MidEleOfLinkedList().new ListNode(3);
		node.next.next.next.next = new MidEleOfLinkedList().new ListNode(4);
		System.out.println(new MidEleOfLinkedList().solve(node));
		
	}

}
