package com.scaler.dsa.linkedList.assignment;

public class RemoveNthNodeFromEnd {
	
	class ListNode {
		 public int val;
		 public ListNode next;
		 ListNode(int x) { val = x; next = null; }
	}
	
	public ListNode removeNthFromEnd(ListNode head, int k) {

        ListNode fast = head;
        ListNode slow = head;
        int i = 0;
        while (i < k && fast != null) {
                fast = fast.next;
                ++i; 
        }
        
        if(k > i && slow != null){
            return slow.next;
        }
 
        if (fast == null) {
            if(head != null){
                return head.next;
            }
            return head;
        }
 
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        if(slow.next != null){
            slow.next = slow.next.next;
        }
        
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveNthNodeFromEnd.ListNode node = new RemoveNthNodeFromEnd().new ListNode(1);
		node.next = new RemoveNthNodeFromEnd().new ListNode(2);
		node.next.next = new RemoveNthNodeFromEnd().new ListNode(3);
		node.next.next.next = new RemoveNthNodeFromEnd().new ListNode(4);
		node.next.next.next.next = new RemoveNthNodeFromEnd().new ListNode(5);
		
		RemoveNthNodeFromEnd.ListNode ansNode = new RemoveNthNodeFromEnd().removeNthFromEnd(node, 10);
		System.out.println(ansNode);
		
		
		node = new RemoveNthNodeFromEnd().new ListNode(1);
		
		ansNode = new RemoveNthNodeFromEnd().removeNthFromEnd(node, 1);
		System.out.println(ansNode);
		
		node = new RemoveNthNodeFromEnd().new ListNode(1);
		node.next = new RemoveNthNodeFromEnd().new ListNode(2);
		node.next.next = new RemoveNthNodeFromEnd().new ListNode(3);
		node.next.next.next = new RemoveNthNodeFromEnd().new ListNode(4);
		node.next.next.next.next = new RemoveNthNodeFromEnd().new ListNode(5);
		
		ansNode = new RemoveNthNodeFromEnd().removeNthFromEnd(node, 2);
		System.out.println(ansNode);
		
		
	}

}
