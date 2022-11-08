package com.scaler.dsa.linkedList.homework;

import com.scaler.dsa.linkedList.homework.RemoveDuplicates.ListNode;

public class SwapListNodes {
	
	class ListNode {
		  public int val;
		  public ListNode next;
		  ListNode(int x) { val = x; next = null; }
	 }
	
	public ListNode swapPairs(ListNode node) {
        return reverseList(node, 2);
    }

    private ListNode reverseList(ListNode head, int k) {
        
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        int count = 0;

        while(count < k && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            ++count;
        }

        if(next != null){
            head.next = reverseList(next, k);
        }

        return prev;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
