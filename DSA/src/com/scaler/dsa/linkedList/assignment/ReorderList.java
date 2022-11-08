package com.scaler.dsa.linkedList.assignment;

public class ReorderList {
	
	class ListNode {
		 public int val;
		 public ListNode next;
		 ListNode(int x) { val = x; next = null; }
	}
	
	private ListNode reverse(ListNode head) {	 
		
		 ListNode current = head;
	     ListNode prev = null;
	     ListNode next = null;

	     while(current != null){
	          next = current.next;
	          current.next = prev;
	          prev = current;
	          current = next;
	     }
	     
	     return prev;
	}
	
	private ListNode mid(ListNode head){
		
		 ListNode slow = head;
	     ListNode fast = (head.next == null) ? null : head.next.next;
	     
	     int i = 2;
	     while(fast != null){
	    	 slow = slow.next;
	    	 i = (fast.next == null) ? i+1 : i+2;
	    	 fast = (fast.next == null) ? null : fast.next.next;
	     }

	     return (i > 2 && i%2 == 0) ? slow.next : slow;
	}
	
	public ListNode reorderList(ListNode head) {
		
		if(head.next == null || head.next.next == null){
			return head;
		}
		
		ListNode first = head;
		ListNode mid = reverse(mid(head));
		ListNode tmp1 = null;
		ListNode tmp2 = null;
		
		while(mid != null && mid.next != null && first.next != null){
			tmp1 = first.next;
			tmp2 = mid.next;
			first.next = mid;
			first = tmp1;			
			mid.next = tmp1;
			mid = tmp2;
		}
		
		return head;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReorderList.ListNode node = new ReorderList().new ListNode(1);
		node.next = new ReorderList().new ListNode(2);
		node.next.next = new ReorderList().new ListNode(3);
		node.next.next.next = new ReorderList().new ListNode(4);
		node.next.next.next.next = new ReorderList().new ListNode(5);
		
		ReorderList.ListNode ansNode = new ReorderList().reorderList(node);
		System.out.println(ansNode);
		
		
		node = new ReorderList().new ListNode(1);
		
		ansNode = new ReorderList().reorderList(node);
		System.out.println(ansNode);
		
		node = new ReorderList().new ListNode(1);
		node.next = new ReorderList().new ListNode(2);
		node.next.next = new ReorderList().new ListNode(3);
		node.next.next.next = new ReorderList().new ListNode(4);
		node.next.next.next.next = new ReorderList().new ListNode(5);
		node.next.next.next.next.next = new ReorderList().new ListNode(6);
		
		ansNode = new ReorderList().reorderList(node);
		System.out.println(ansNode);
		
		node = new ReorderList().new ListNode(1);
		node.next = new ReorderList().new ListNode(2);
		ansNode = new ReorderList().reorderList(node);
		System.out.println(ansNode);
	}

}
