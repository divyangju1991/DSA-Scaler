package com.scaler.dsa.linkedList;


public class Intersection {
	
	class ListNode {
		 public int val;
		 public ListNode next;
		 ListNode(int x) { val = x; next = null; }
	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	    //boundary check
	    if(headA == null || headB == null) return null;
	    
	    ListNode a = headA;
	    ListNode b = headB;
	    
	    //if a & b have different len, then we will stop the loop after second iteration
	    while( a != b){
	    	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
	        a = a == null? headB : a.next;
	        b = b == null? headA : b.next;    
	    }
	    
	    return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intersection.ListNode mergeNode = new Intersection().new ListNode(5);
		
		Intersection.ListNode node = new Intersection().new ListNode(1);
		node.next = new Intersection().new ListNode(2);
		node.next.next = new Intersection().new ListNode(3);
		node.next.next.next = new Intersection().new ListNode(4);
		node.next.next.next.next = mergeNode;
		
		
		Intersection.ListNode node2 = new Intersection().new ListNode(10);
		node2.next = new Intersection().new ListNode(10);
		node2.next.next = new Intersection().new ListNode(20);
		node2.next.next.next = new Intersection().new ListNode(40);
		node2.next.next.next.next = mergeNode;
		
		Intersection.ListNode ansNode = new Intersection().getIntersectionNode(node, node2);
		System.out.println(ansNode.val);
		
		mergeNode = new Intersection().new ListNode(3);
		node = new Intersection().new ListNode(1);
		node.next = new Intersection().new ListNode(2);
		node.next.next = mergeNode;
		node.next.next.next = new Intersection().new ListNode(4);
		node.next.next.next.next = new Intersection().new ListNode(5);
		
		
		node2 = new Intersection().new ListNode(10);
		node2.next = mergeNode;
		
		ansNode = new Intersection().getIntersectionNode(node, node2);
		System.out.println(ansNode.val);
		
	}

}
