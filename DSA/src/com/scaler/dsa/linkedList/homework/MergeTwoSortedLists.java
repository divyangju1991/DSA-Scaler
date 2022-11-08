package com.scaler.dsa.linkedList.homework;


public class MergeTwoSortedLists {
	
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

        ListNode head;        
        if(l1.val < l2.val){
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }

        ListNode p = head;

        while(l1 != null && l2 != null){

            if(l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }

            p = p.next;
        }

        while(l1 != null){
            p.next = l1;
            p = p.next;
            l1 = l1.next;
        }

        while(l2 != null){
            p.next = l2;
            p = p.next;
            l2 = l2.next;
        }

        return head;

    }

	public static void main(String[] args) {
		
		MergeTwoSortedLists.ListNode node = new MergeTwoSortedLists().new ListNode(5);
		node.next = new MergeTwoSortedLists().new ListNode(8);
		node.next.next = new MergeTwoSortedLists().new ListNode(20);
		
		MergeTwoSortedLists.ListNode node2 = new MergeTwoSortedLists().new ListNode(4);
		node2.next = new MergeTwoSortedLists().new ListNode(11);
		node2.next.next = new MergeTwoSortedLists().new ListNode(15);
		
		MergeTwoSortedLists.ListNode ansNode = new MergeTwoSortedLists().mergeTwoLists(node, node2);
		System.out.println(ansNode);

	}

}
