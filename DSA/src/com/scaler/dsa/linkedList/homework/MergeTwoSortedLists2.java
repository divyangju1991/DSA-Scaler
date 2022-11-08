package com.scaler.dsa.linkedList.homework;


public class MergeTwoSortedLists2 {
	
	class ListNode {
		  public int val;
		  public ListNode next;
		  ListNode(int x) { val = x; next = null; }
	 }
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null){
			return l2;
		}
		
		if(l2 == null){
			return l1;
		}
		
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2); 
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}

	public static void main(String[] args) {
		
		MergeTwoSortedLists2.ListNode node = new MergeTwoSortedLists2().new ListNode(5);
		node.next = new MergeTwoSortedLists2().new ListNode(8);
		node.next.next = new MergeTwoSortedLists2().new ListNode(20);
		
		MergeTwoSortedLists2.ListNode node2 = new MergeTwoSortedLists2().new ListNode(4);
		node2.next = new MergeTwoSortedLists2().new ListNode(11);
		node2.next.next = new MergeTwoSortedLists2().new ListNode(15);
		
		MergeTwoSortedLists2.ListNode ansNode = new MergeTwoSortedLists2().mergeTwoLists(node, node2);
		System.out.println(ansNode);

	}

}
