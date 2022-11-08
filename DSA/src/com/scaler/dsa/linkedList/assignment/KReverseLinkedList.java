package com.scaler.dsa.linkedList.assignment;

import com.scaler.dsa.linkedList.assignment.RemoveNthNodeFromEnd.ListNode;

/**
 * 
 * @author Divyang
 *
 * 
 Example Input
Input 1:

 A = [1, 2, 3, 4, 5, 6]
 B = 2
Input 2:

 A = [1, 2, 3, 4, 5, 6]
 B = 3


Example Output
Output 1:

 [2, 1, 4, 3, 6, 5]
Output 2:

 [3, 2, 1, 6, 5, 4]
 */
public class KReverseLinkedList {
	
	class ListNode {
		 public int val;
		 public ListNode next;
		 ListNode(int x) { val = x; next = null; }
	}
	
	public ListNode reverseList(ListNode head, int k) {
        
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
		KReverseLinkedList.ListNode node = new KReverseLinkedList().new ListNode(1);
		node.next = new KReverseLinkedList().new ListNode(2);
		node.next.next = new KReverseLinkedList().new ListNode(3);
		node.next.next.next = new KReverseLinkedList().new ListNode(4);
		node.next.next.next.next = new KReverseLinkedList().new ListNode(5);
		node.next.next.next.next.next = new KReverseLinkedList().new ListNode(6);
		
		KReverseLinkedList.ListNode ansNode = new KReverseLinkedList().reverseList(node, 2);
		System.out.println(ansNode);
	}

}
